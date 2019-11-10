package cn.edu.ccut.examination;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("hello");
		sf.append(" world");
		System.out.println(sf);
		String str = "hello";
		str.concat(" world");
		System.out.println(str);
	}

}
