package anand.concurrent.completable.future.solution1;

public class InventoryService {
    public void saveOrder() {
        sleep(1000);
        System.out.println("Saving order");
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
