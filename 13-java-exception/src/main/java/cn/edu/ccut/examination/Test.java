package cn.edu.ccut.examination;
/**
 * test exception finally return
 * @author jwang
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println(testReturn());
	}
	
	public static String testReturn() {
		try {
			String a = "hello";
			int b = 1 / 0;
			return a;
		}catch (Exception e) {
			return "exception";
		}finally {
			System.out.println("finally");
		}
	}

}
