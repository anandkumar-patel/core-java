package anand.concurrent.completable.future.solution3;

public class PaymentService {
    public String processPayment() {
        sleep(3000);
        System.out.println("Processing payment...");
        return "success";
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
