public class Main {

    public static void main(String[] args) {

        MiddlewarePipeline pipeline = new MiddlewarePipeline();

        pipeline.add(new LoggingMiddleware());
        pipeline.add(new AuthenticationMiddleware());
        pipeline.add(new ValidationMiddleware());

        Request request = new Request(
            "/api/orders",
            "valid-token"
        );

        pipeline.execute(request);
    }
}