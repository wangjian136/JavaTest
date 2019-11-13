package cn.edu.ccut.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ReaderAndWriterStream
 * @author jwang
 *
 */
public class ReaderAndWriterStream {

	public static void main(String[] args) {
		//testInput();
		//testOutput();
	}
	
	public static void testInput() {
		try (
			FileReader in = new FileReader("test.txt");
		){
			char [] cbufs = new char[2];
			while(in.read(cbufs) != -1) {
				System.out.print(cbufs);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void testOutput() {
		try (
			FileWriter out = new FileWriter("test2.txt");
		){
			String str = "我爱我的祖国";
			out.write(str);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
