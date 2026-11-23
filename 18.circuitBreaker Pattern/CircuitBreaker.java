public class CircuitBreaker {

    private int failureCount = 0;
    private final int failureThreshold = 3;

    private boolean open = false;

    public void execute(PaymentService service) {

        if (open) {
            System.out.println("Circuit OPEN - Request blocked");
            return;
        }

        try {

            service.processPayment();

            failureCount = 0;

        } catch (RuntimeException e) {

            failureCount++;

            System.out.println("Payment failed: " + e.getMessage());

            if (failureCount >= failureThreshold) {

                open = true;

                System.out.println("Circuit is now OPEN");
            }
        }
    }
}