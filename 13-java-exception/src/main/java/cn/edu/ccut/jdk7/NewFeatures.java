package cn.edu.ccut.jdk7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * NewFeatures
 * @author jwang
 *
 */
public class NewFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void oldCatchException() {
		//JDK1.7以前捕获多个异常
		try {
			File file = new File("ss");
			file.createNewFile();
			Connection connection = DriverManager.getConnection("ss");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void newCatchException() {
		//JDK1.7以后捕获多个异常
		try {
			File file = new File("ss");
			file.createNewFile();
			Connection connection = DriverManager.getConnection("ss");
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void oldSolveException() {
		//JDK1.7之前使用资源类
		FileInputStream in = null;
		try {
			in = new FileInputStream("F:\test.txt");
			//后续操作
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void newSolveException() {
		//JDK1.7之后使用资源类
		try (
			//资源定义，定义后无需考虑关闭
			FileInputStream in = new FileInputStream("F:\test.txt");
		){
			//后续操作
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
