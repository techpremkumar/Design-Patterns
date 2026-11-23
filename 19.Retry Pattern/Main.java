public class Main {

    public static void main(String[] args) {

        RetryExecutor retry =
                new RetryExecutor(3, 1000);

        int[] attempts = {0};

        retry.execute(() -> {

            attempts[0]++;

            if (attempts[0] < 3) {
                throw new RuntimeException("Server unavailable");
            }

            System.out.println("Payment processed!");
        });
    }
}