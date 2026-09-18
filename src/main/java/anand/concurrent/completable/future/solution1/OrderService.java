package anand.concurrent.completable.future.solution1;

public class OrderService {
    public void placeOrder() {
        System.out.println("Placing order...");
        PaymentService paymentService = new PaymentService();
        sleep(2000);

        new Thread(()-> {
            String paymentResult = paymentService.processPayment();
            System.out.println("Payment result: " + paymentResult);
        }).start();

        InventoryService inventoryService = new InventoryService();
        inventoryService.saveOrder();
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
