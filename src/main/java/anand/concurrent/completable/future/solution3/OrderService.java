package anand.concurrent.completable.future.solution3;

import java.util.concurrent.*;

public class OrderService {
    public void placeOrder() throws ExecutionException, InterruptedException {
        System.out.println("Placing order...");
        PaymentService paymentService = new PaymentService();
        InventoryService inventoryService = new InventoryService();
        sleep(2000);

        CompletableFuture<String> payment = CompletableFuture.supplyAsync(paymentService::processPayment);

        payment.thenAccept(inventoryService::saveOrder);
        payment.get();
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
