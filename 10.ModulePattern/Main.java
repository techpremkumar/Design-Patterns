public class Main {

    public static void main(String[] args) {

        UserModule user = new UserModule();
        PaymentModule payment = new PaymentModule();
        OrderModule order = new OrderModule();

        user.login("Prem");

        order.placeOrder("Laptop");

        payment.processPayment(50000);

        user.logout();
    }
}