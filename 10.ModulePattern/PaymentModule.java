public class PaymentModule {

    public void processPayment(double amount) {

        validatePayment(amount);

        System.out.println("Payment successful: " + amount);
    }

    private void validatePayment(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        System.out.println("Payment validated");
    }
}