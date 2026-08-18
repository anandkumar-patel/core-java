package anand.concurrent.join;

public class Worker implements Runnable{

	public Worker() {
		System.out.println("worker thread constructore...");
	}
	@Override
	public void run() {
		for(int i =0;i<100;i++) {
			try {
				System.out.println("In the worker thread run method..."+i);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
