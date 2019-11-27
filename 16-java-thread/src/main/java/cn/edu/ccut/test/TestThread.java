package cn.edu.ccut.test;

/**
 * TestThread
 * 
 * @author jwang
 *
 */
public class TestThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("test thread");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {

		TestThread testThread = new TestThread();
		testThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("test main");
		}

	}

}
