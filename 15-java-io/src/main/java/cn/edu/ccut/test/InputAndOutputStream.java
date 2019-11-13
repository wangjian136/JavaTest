package cn.edu.ccut.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * InputAndOutputStream
 * @author jwang
 *
 */
public class InputAndOutputStream {

	public static void main(String[] args) {
		//testInput();
		//testOutput();
	}
	
	public static void testInput() {
		try (
			FileInputStream in = new FileInputStream("test.txt");
		){
			byte [] bytes = new byte[2];
			while(in.read(bytes) != -1) {
				String str = new String(bytes,"GBK");
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void testOutput() {
		try (
			FileOutputStream out = new FileOutputStream("test2.txt");
		){
			String str = "我爱我的祖国";
			out.write(str.getBytes());
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
