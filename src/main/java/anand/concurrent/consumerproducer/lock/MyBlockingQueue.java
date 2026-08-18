package anand.concurrent.consumerproducer.lock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {
	private final Queue<E> queue;
	private final int maxSize;

	private final ReentrantLock lock = new ReentrantLock(true);
	private final Condition notEmpty = lock.newCondition();
	private final Condition notFull = lock.newCondition();

	public MyBlockingQueue() {
		this.queue = new LinkedList<>();
		this.maxSize = 16; // default maxSize
	}

	public MyBlockingQueue(int size) {
		this.queue = new LinkedList<>();
		this.maxSize = size;
	}

	public void put(E e) {
		lock.lock();
		try {
			while (queue.size() == maxSize) {
				notFull.await();
			}
			queue.add(e);
			notEmpty.signalAll();
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt(); // Restore interrupt status
			ex.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public E take() {
		lock.lock();
		try {
			while (queue.isEmpty()) {
				notEmpty.await();
			}
			E item = queue.remove();
			notFull.signalAll();
			return item;
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt(); // Restore interrupt status
			ex.printStackTrace();
			return null; // Or handle it based on your application's requirements
		} finally {
			lock.unlock();
		}
	}
}
