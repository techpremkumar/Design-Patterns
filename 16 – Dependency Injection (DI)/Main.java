

public class Main {

    public static void main(String[] args) {

        PaymentService payment =
                new UPIPaymentService();

        OrderService order =
                new OrderService(payment);

        order.placeOrder();
    }
}