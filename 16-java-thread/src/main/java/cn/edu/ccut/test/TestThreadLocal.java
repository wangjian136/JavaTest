package cn.edu.ccut.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestThreadLocal {
	
	private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		};
	};
	
	public static Date convert(String dateStr) {
		try {
			return threadLocal.get().parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ExecutorService service = Executors.newFixedThreadPool(10);
		Callable<Date> callable = new Callable<Date>() {
			@Override
			public Date call() throws Exception {
				return sdf.parse("2019-01-01");
			}
		};
		
		List<Future<Date>> result = new ArrayList<Future<Date>>();
		
		for (int i = 0; i < 10; i++) {
			result.add(service.submit(callable));
		}
		
		for (Future<Date> future : result) {
			System.out.println(future.get());
		}
		
		service.shutdown();
	}

}
