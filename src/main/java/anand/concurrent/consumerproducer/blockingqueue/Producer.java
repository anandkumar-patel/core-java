package anand.concurrent.consumerproducer.blockingqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<Item> queue = new ArrayBlockingQueue<>(10);

	public Producer(BlockingQueue<Item> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				queue.put(createItem());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private Item createItem() {
		Random random = new Random();
		int id = random.nextInt(100, 999);
		System.out.println("Item with id" + id + " produced");
		return new Item(id, "Item-" + id);
	}
}
