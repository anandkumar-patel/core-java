package anand.concurrent.completable.future.solution1;

public class MainMethod {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder();
    }
}
