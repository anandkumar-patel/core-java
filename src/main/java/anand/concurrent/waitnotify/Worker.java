package anand.concurrent.waitnotify;

public class Worker implements Runnable{
	Object monitorObj = null;
	public Worker(Object monitorObj) {
		System.out.println("worker thread constructore...");
		this.monitorObj = monitorObj;
	}
	
	@Override
	public void run() {
		System.out.println("Waiting to acquire the monitor");
        synchronized(monitorObj) {
            System.out.println("About to wake up the waiting thread");
            monitorObj.notify();
        }
        //Now that we are out of the synchronized block, the Worker thread has released the monitor
        //Furthermore, notify() was invoked in the synchronized block above
        System.out.println("Now that the waiting thread has woken up, this Worker thread can continue running as usual");
        //The worker thread continues running and executes additional code that may be present here
	}

}
