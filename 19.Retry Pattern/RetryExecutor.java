public class RetryExecutor {

    private final int maxAttempts;
    private final long delay;

    public RetryExecutor(int maxAttempts, long delay) {
        this.maxAttempts = maxAttempts;
        this.delay = delay;
    }

    public void execute(Runnable task) {

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            try {

                System.out.println("Attempt: " + attempt);

                task.run();

                System.out.println("Operation successful");
                return;

            } catch (RuntimeException e) {

                System.out.println("Operation failed: " + e.getMessage());

                if (attempt == maxAttempts) {
                    System.out.println("Maximum attempts reached");
                    return;
                }

                try {
                    Thread.sleep(delay);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}