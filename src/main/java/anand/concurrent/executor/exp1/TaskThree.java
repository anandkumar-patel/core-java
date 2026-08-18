package anand.concurrent.executor.exp1;

public class TaskThree implements Runnable {
	public void run() {
		System.out.println("Executing Task Three");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
