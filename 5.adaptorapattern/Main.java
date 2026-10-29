
interface PaymentProcessor {
    void pay(double amount);
}

// Existing third-party class
class LegacyPayment {
    void makePayment(double amount) {
        System.out.println("Legacy payment: ₹" + amount);
    }
}

// Adapter
class PaymentAdapter implements PaymentProcessor {
    private final LegacyPayment legacyPayment;

    PaymentAdapter(LegacyPayment legacyPayment) {
        this.legacyPayment = legacyPayment;
    }

    @Override
    public void pay(double amount) {
        legacyPayment.makePayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        LegacyPayment legacy = new LegacyPayment();

        PaymentProcessor processor =
                new PaymentAdapter(legacy);

        processor.pay(1500);
    }
}
