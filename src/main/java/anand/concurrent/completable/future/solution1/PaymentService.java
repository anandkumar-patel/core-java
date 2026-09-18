package anand.concurrent.completable.future.solution1;

public class PaymentService {
    public String processPayment() {
        sleep(4000);
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
