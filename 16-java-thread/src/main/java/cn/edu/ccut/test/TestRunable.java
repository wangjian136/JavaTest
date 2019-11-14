package cn.edu.ccut.test;
/**
 * TestRunable
 * @author jwang
 *
 */
public class TestRunable implements Runnable{

	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("test runnable");
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		TestRunable testRunable = new TestRunable();
		new Thread(testRunable).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("test main");
		}
		
	}

}
