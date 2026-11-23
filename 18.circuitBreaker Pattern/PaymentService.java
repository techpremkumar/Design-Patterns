public class PaymentService {

    private boolean serviceAvailable = false;

    public void processPayment() {

        if (!serviceAvailable) {
            throw new RuntimeException("Payment service unavailable");
        }

        System.out.println("Payment processed successfully");
    }

    public void setServiceAvailable(boolean available) {
        this.serviceAvailable = available;
    }
}