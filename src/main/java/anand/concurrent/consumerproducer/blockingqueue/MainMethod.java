package anand.concurrent.consumerproducer.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainMethod {
	public static void main(String[] args) {
		
		BlockingQueue<Item> queue = new ArrayBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);
		new Thread(producer).start();
		new Thread(producer).start();
		
		// consumer
		Consumer consumer = new Consumer(queue);
		new Thread(consumer).start();
		new Thread(consumer).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
