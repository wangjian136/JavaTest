package cn.edu.ccut.examination;

public class Test {
	public static void main(String[] args) {
		System.out.println(test());

	}

	private static int test() {
		int temp = 1;
		try {
			System.out.println(temp);//1
			int a = 1/0;
			return ++temp;
		} catch (Exception e) {
			System.out.println(temp);
			return ++temp;
		} finally {
			++temp;
			System.out.println(temp);
		}
	}
}