public class Main {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        CircuitBreaker breaker = new CircuitBreaker();

        breaker.execute(service);
        breaker.execute(service);
        breaker.execute(service);

        // Fourth request
        breaker.execute(service);
    }
}