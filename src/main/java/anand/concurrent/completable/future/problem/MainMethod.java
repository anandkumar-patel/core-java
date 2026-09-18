package anand.concurrent.completable.future.problem;

public class MainMethod {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder();
    }
}
