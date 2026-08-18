package anand.concurrent.waitnotify;

public class WaitNotifyMainClass {

	public static void main(String[] args) throws InterruptedException {
		WaitNotifyMainClass obj = new WaitNotifyMainClass();
		obj.startMain();
	}

	public void startMain() {
		// This code is run by the 'waiting' thread
		Object monitorObj = new Object();

		// Our worker object now has access to the same object monitorObj as this thread
		// Therefore, both the waiting thread and the worker thread have the same object
		// to synchronize upon
		Worker worker = new Worker(monitorObj);

		Thread thread = new Thread(worker);

		// Claiming monitorObj's monitor
		synchronized (monitorObj) {
			System.out.println("About to start the worker thread");
			// The worker thread has been started
			thread.start();
			try {
				System.out.println("This thread is going to pause until another thread wakes it up");

				// This thread now pauses and releases the monitor. It can be claimed by any
				// other thread
				monitorObj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("This thread has now resumed since Worker has called notify() and released the monitor");
	}

}
