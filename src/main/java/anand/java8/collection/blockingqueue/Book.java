package anand.java8.collection.blockingqueue;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
	private static AtomicInteger seq = new AtomicInteger(0);
	Integer id;

	Book() {
		this.id = seq.incrementAndGet();
	}

	@Override
	public String toString() {
		return this.id.toString();
	}
}