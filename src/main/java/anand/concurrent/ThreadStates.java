package anand.concurrent;

public class ThreadStates {

	public static void main(String[] args) {
		System.out.println("Main method started...");
		Thread thread = new Thread(new MyThread(), "MyThread");

		displayState("State after creation", thread);
		// Calling start method
		thread.start();

		try {
			// sleep method on Main thread
			Thread.sleep(200);
			displayState("After starting ", thread);
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		displayState("State after running ", thread);

		System.out.println("Main method ended...");
	}

	public static void displayState(String msg, Thread thread) {
		System.out.println(msg + "- " + "Thread Name- " + thread.getName() + " State- " + thread.getState()
				+ " , and Is alive :" + thread.isAlive());
	}
}

class MyThread implements Runnable {
	public MyThread() {
		System.out.println("MyThread constructor");
	}

	@Override
	public void run() {
		ThreadStates.displayState("State in run method ", Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadStates.displayState("In run method after sleep", Thread.currentThread());
	}
}
