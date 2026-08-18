package anand.concurrent.consumerproducer.lock;

public class Consumer implements Runnable {
	MyBlockingQueue<Item> queue = null;

	public Consumer(MyBlockingQueue<Item> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			Item item = queue.take();
			process(item);
		}
	}

	private void process(Item item) {
		System.out.println("item consumed : " + item.toString());
	}
}
