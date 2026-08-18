package anand.concurrent.join;

public class JoinMainClass {

	public static void main(String[] args) throws InterruptedException {

		Worker worker = new Worker();
		Thread workerThread = new Thread(worker);
		String currentThreadName = Thread.currentThread().getName();
		System.out.println(currentThreadName + " started....");
		
		workerThread.start();
		workerThread.join();
		System.out.println(currentThreadName + " ended....");
		
	}

}
