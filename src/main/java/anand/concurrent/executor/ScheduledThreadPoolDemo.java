package anand.concurrent.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolDemo {

	public static void main(String[] args) {

		// for scheduling a task
		ScheduledExecutorService service = Executors.newScheduledThreadPool(100);

		// task to run after 10 second dealy
		service.schedule(new ScheduledTask(), 10, TimeUnit.SECONDS);

		// task to run repeatedly every 10 seconds
		service.scheduleAtFixedRate(new ScheduledTask(), 15, 10, TimeUnit.SECONDS);

		// task to run repeatedly 10 seconds after previous task completes
		service.scheduleWithFixedDelay(new ScheduledTask(), 15, 10, TimeUnit.SECONDS);
	}

	static class ScheduledTask implements Runnable {

		@Override
		public void run() {
			System.out.println("hello");
		}

	}
}
