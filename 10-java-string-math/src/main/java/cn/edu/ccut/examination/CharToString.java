package cn.edu.ccut.examination;

public class CharToString {
	public static void main(String[] args) {
		char myChar = 'g';
		String myStr = Character.toString(myChar);
		System.out.println("String is: " + myStr);
		myStr = String.valueOf(myChar);
		System.out.println("String is: " + myStr);
	}
}