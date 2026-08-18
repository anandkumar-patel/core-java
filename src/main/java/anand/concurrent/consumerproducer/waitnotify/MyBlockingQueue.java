package anand.concurrent.consumerproducer.waitnotify;

import java.util.LinkedList;
import java.util.Queue;

// Using wait and notify
public class MyBlockingQueue<E> {
    private final Queue<E> queue;
    private final int maxSize;

    public MyBlockingQueue() {
        this.queue = new LinkedList<>();
        this.maxSize = 16; // default maxSize
    }

    public MyBlockingQueue(int size) {
        this.queue = new LinkedList<>();
        this.maxSize = size;
    }

    public synchronized void put(E e) {
        while (queue.size() == maxSize) {
            try {
				wait(); // Wait until space is available
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			} 
        }
        queue.add(e);
        notify(); // Notify any waiting consumer
    }

    public synchronized E take() {
        while (queue.isEmpty()) {
            try {
				wait(); // Wait until an item is available
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        E item = queue.remove();
        notify(); // Notify any waiting producer
        return item;
    }
}
