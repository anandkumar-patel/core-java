package anand.concurrent.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

	public static void main(String[] args) {

		// get the count of available core
		int coreCount = Runtime.getRuntime().availableProcessors();

		ExecutorService service = Executors.newFixedThreadPool(coreCount);

		// submit the task for execution
		for (int i = 0; i < 100; i++) {
			service.execute(new CpuIntensiceTask());
		}
	}

	static class CpuIntensiceTask implements Runnable {

		@Override
		public void run() {
			System.out.println("hello");
		}

	}
}

/*
 * Create a thread pool size as number of cores for cpu intensive task and
 * created bigger for io intensive task
 * 
 */
