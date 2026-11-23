public class LoggingMiddleware implements Middleware {

    @Override
    public boolean handle(Request request) {
        System.out.println("Logging request: " + request.path);
        return true;
    }
}