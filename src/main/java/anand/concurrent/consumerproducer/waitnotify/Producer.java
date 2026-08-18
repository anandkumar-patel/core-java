package anand.concurrent.consumerproducer.waitnotify;

import java.util.Random;

public class Producer implements Runnable {
	MyBlockingQueue<Item> queue = null;

	public Producer(MyBlockingQueue<Item> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			queue.put(createItem());
		}
	}

	private Item createItem() {
		Random random = new Random();
		int id = random.nextInt(100, 999);
		System.out.println("Item with id" + id + " produced by :" + Thread.currentThread().getName());
		return new Item(id, "Item-" + id);
	}
}