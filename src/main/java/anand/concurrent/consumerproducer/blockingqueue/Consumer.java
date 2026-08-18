package anand.concurrent.consumerproducer.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<Item> queue = new ArrayBlockingQueue<>(10);

	public Consumer(BlockingQueue<Item> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			Item item = null;
			try {
				item = queue.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			process(item);
		}
	}

	private void process(Item item) {
		System.out.println("item consumed : " + item.toString());
	}
}
