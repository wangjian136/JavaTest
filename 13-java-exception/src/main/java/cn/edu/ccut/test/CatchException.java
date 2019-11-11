package cn.edu.ccut.test;

import java.io.File;
import java.io.IOException;

/**
 * CatchException
 * @author jwang
 *
 */
public class CatchException {

	public static void main(String[] args) {
		runtimeException();
		//nonRuntimeException();
		//nonRuntimeException2();
	}
	
	public static void runtimeException() {
		try {
			String str = null;
			System.out.println(str.charAt(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void nonRuntimeException() {
		File file = new File("ss");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("无论是否发生异常我都将执行！");
			file.delete();
		}
	}
	
	public static void nonRuntimeException2() throws IOException{
		File file = new File("ss");
		file.createNewFile();
		file.delete();
	}
	
	
}
