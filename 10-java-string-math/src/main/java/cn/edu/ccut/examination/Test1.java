package cn.edu.ccut.examination;

public class Test1 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = "hello";
		String str4 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str4);
		System.out.println(str1.equals(str2));
		//StringBuffer StringBuilder
		String a = "hello";
		String b = a.concat(" world");
		System.out.println(a == b);
		StringBuilder sb = new StringBuilder("hello");
		StringBuilder sb2 = sb.append(" world");
		System.out.println(sb == sb2);
	}

}
