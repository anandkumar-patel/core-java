package anand.concurrent.consumerproducer.waitnotify;

public class MainMethod {

	public static void main(String[] args) throws InterruptedException {

		MyBlockingQueue<Item> queue = new MyBlockingQueue<>(10);

		Producer producer = new Producer(queue);
		new Thread(producer, "producer-01").start();
		new Thread(producer, "producer-02").start();

		// consumer
		Consumer consumer = new Consumer(queue);
		new Thread(consumer, "consumer-01").start();
		new Thread(consumer, "consumer-02").start();

	}
}
