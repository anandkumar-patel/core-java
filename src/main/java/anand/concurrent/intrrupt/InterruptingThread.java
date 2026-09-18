package anand.concurrent.intrrupt;

public class InterruptingThread extends Thread {
    public InterruptingThread() {
        super("InterruptingThread");
    }

    @Override
    public void run() {
        SleepingWorkerThread worker = new SleepingWorkerThread();
        worker.start();

        for (int i = 0; i < 2; i++) {
            System.out.println("\n--- " + Thread.currentThread().getName() + " Iteration " + i + " ---");
            try {
                Thread.sleep(2000); // Simulate some work
                System.out.println(Thread.currentThread().getName() + " is interrupting the worker...");
                worker.interrupt();
            }catch (InterruptedException e) {
                System.out.println("InterruptingThread was interrupted!");
            }
        }
    }
}