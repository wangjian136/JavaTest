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
		//JDK1.7��ǰ�������쳣
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
		//JDK1.7�Ժ󲶻����쳣
		try {
			File file = new File("ss");
			file.createNewFile();
			Connection connection = DriverManager.getConnection("ss");
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void oldSolveException() {
		//JDK1.7֮ǰʹ����Դ��
		FileInputStream in = null;
		try {
			in = new FileInputStream("F:\test.txt");
			//��������
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
		//JDK1.7֮��ʹ����Դ��
		try (
			//��Դ���壬��������迼�ǹر�
			FileInputStream in = new FileInputStream("F:\test.txt");
		){
			//��������
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
