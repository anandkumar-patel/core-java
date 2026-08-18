package anand.concurrent.intrrupt;

public class ThreadInterruptedExpDemo {
	public static void main(String[] args) {

		Yes y = new Yes();
		y.start();
	}

}

class Ie extends Thread {
	public Ie() {
		super("Ie");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception");
			}
		}
	}
}

class Yes extends Thread {
	public Yes() {
		super("Yes");
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			Ie t1 = new Ie();

			t1.start();
			t1.interrupt();

		}
	}
}
