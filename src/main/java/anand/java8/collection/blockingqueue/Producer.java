package anand.java8.collection.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private final BlockingQueue<Book> queue;

	Producer(BlockingQueue<Book> q) {
		queue = q;
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				queue.put(produce());
				Thread.sleep(10);
			}
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}

	Book produce() {
		Book book = new Book();
		System.out.printf("Put %s %s", book, System.lineSeparator());

		return book;
	}
}