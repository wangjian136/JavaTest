package cn.edu.ccut.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TestCallable
 * @author jwang
 *
 */
public class TestThreadPool implements Runnable{

	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("test threadPool");
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		TestThreadPool thread = new TestThreadPool();
		service.submit(thread);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("test main");
		}
		
		service.shutdown();
		
	}

}
