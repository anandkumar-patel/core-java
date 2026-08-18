package anand.concurrent.executor;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// get the count of available core
		int coreCount = Runtime.getRuntime().availableProcessors();

		// create the pool
		ExecutorService service = Executors.newFixedThreadPool(coreCount);

		// submit the task for execution
		Future<Integer> future = service.submit(new TaskCallable());

		// perform some unrelated operations here
		// ---
		// ----
		System.out.println("somne unreladted  operation is going on.. before the taking future");

		Integer result = future.get(); // blocking

		System.out.println("somne unreladted  operation is going on.. after the taking future");

		System.out.println("Thread name :" + Thread.currentThread().getName() + " and callable result is :" + result);

	}

	static class TaskCallable implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			Thread.sleep(3000);
			return new Random().nextInt();
		}

	}

}
