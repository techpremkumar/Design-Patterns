
interface PaymentStrategy {
    void pay(double amount);
}

class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal");
    }
}

class PaymentService {
    private final PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        strategy.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {

        PaymentStrategy upi = new UpiPayment();
        PaymentService service1 = new PaymentService(upi);
        service1.pay(1500);

        PaymentStrategy card = new CardPayment();
        PaymentService service2 = new PaymentService(card);
        service2.pay(2500);

        PaymentStrategy paypal = new PayPalPayment();
        PaymentService service3 = new PaymentService(paypal);
        service3.pay(3000);
    }
}
