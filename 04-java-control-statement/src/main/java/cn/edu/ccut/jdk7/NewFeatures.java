package cn.edu.ccut.jdk7;

public class NewFeatures {

	public static void main(String[] args) {
		//JDK1.7使用字符串作为判断条件
		String key = "a";
		switch (key) {
		case "a":
			System.out.println("a");
			break;
		case "b":
			System.out.println("b");
			break;
		default:
			System.out.println("b");
			break;
		}
	}

}
