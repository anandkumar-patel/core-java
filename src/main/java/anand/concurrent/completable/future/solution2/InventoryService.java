package anand.concurrent.completable.future.solution2;

public class InventoryService {
    public void saveOrder(String status) {
        sleep(1000);
        System.out.println("Saving order with status :"+ status);
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
