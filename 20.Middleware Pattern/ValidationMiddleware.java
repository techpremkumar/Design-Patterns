public class ValidationMiddleware implements Middleware {

    @Override
    public boolean handle(Request request) {
        if (request.path == null || request.path.isEmpty()) {
            System.out.println("Invalid request path");
            return false;
        }

        System.out.println("Request validation successful");
        return true;
    }
}