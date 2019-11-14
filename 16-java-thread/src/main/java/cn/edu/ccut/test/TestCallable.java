package cn.edu.ccut.test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * TestCallable
 * @author jwang
 *
 */
public class TestCallable implements Callable<String>{

	
	@Override
	public String call() {
		for (int i = 0; i < 10; i++) {
			System.out.println("test callable");
		}
		return "success";
	}
	
	
	public static void main(String[] args) throws Exception{
		TestCallable callable = new TestCallable();
		FutureTask<String> task = new FutureTask<String>(callable);
		new Thread(task).start();
		System.out.println(task.get());
		for (int i = 0; i < 10; i++) {
			System.out.println("test main");
		}
		
	}

}
