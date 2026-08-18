package anand.concurrent.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();

		// submit the task for execution
		for (int i = 0; i < 3; i++) {
			service.execute(new Task());
		}
	}

	static class Task implements Runnable {

		@Override
		public void run() throws NullPointerException{
			System.out.println("hello");
			String ad = "data";
			if(ad.length()>1) {
				ad = null;
			}
			System.out.println("ad len"+ad.length());
		}

	}
}
