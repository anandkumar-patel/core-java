package anand.concurrent.intrrupt;

public class MainClass {
	public static void main(String[] args) {
		// The master thread that starts the interruption loop
		InterruptingThread controller = new InterruptingThread();
		controller.start();
	}
}

