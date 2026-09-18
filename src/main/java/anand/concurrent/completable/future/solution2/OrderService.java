package anand.concurrent.completable.future.solution2;

import java.util.concurrent.*;

public class OrderService {
    public void placeOrder() throws ExecutionException, InterruptedException {
        System.out.println("Placing order...");
        PaymentService paymentService = new PaymentService();
        sleep(2000);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> payment = executorService.submit(paymentService::processPayment);
        String status = payment.get();
        System.out.println("payment status "+ status);

        InventoryService inventoryService = new InventoryService();
        inventoryService.saveOrder(status);
        System.out.println("Order completed");
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
