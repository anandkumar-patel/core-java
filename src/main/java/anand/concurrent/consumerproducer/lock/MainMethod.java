package anand.concurrent.consumerproducer.lock;


public class MainMethod {
	public static void main(String[] args) {
		MyBlockingQueue<Item> queue = new MyBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);
		new Thread(producer).start();
		new Thread(producer).start();
		
		// consumer
		Consumer consumer = new Consumer(queue);
		new Thread(consumer).start();
		new Thread(consumer).start();
		
	}
}
