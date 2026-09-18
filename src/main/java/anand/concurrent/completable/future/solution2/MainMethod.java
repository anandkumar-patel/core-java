package anand.concurrent.completable.future.solution2;

import java.util.concurrent.ExecutionException;

public class MainMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        OrderService orderService = new OrderService();
        orderService.placeOrder();
    }
}
