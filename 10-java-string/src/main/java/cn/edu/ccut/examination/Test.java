package cn.edu.ccut.examination;

public class Test {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = "hello";
		String str4 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str4);
		System.out.println(str1.equals(str2));
	}

}
