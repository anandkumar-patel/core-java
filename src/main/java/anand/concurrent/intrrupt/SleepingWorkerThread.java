package anand.concurrent.intrrupt;

public class SleepingWorkerThread extends Thread {
    public SleepingWorkerThread() {
        super("SleepingWorkerThread");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is running loop " + i);
            try {
                // Sleeping makes the thread vulnerable to InterruptedException
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("-> SUCCESS: " + Thread.currentThread().getName() + " caught InterruptedException!");
            }
        }
    }
}