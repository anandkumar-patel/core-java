package anand.concurrent.pool;

import java.util.Random;

public class WorkerThread implements Runnable {
	private int counter;

	public WorkerThread(int counter) {
		this.counter = counter;
	}

	public void run() {
		Random r = new Random();
		int rn = r.nextInt();
		System.out.println(Thread.currentThread().getName() + " (Start),"+rn+" counter = " + counter);
		processmessage();// call processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End),"+rn+"  counter = " + counter);
	}
	private void processmessage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
