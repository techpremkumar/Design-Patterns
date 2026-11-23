public class AuthenticationMiddleware implements Middleware {

    @Override
    public boolean handle(Request request) {

        if (request.token == null || request.token.isEmpty()) {
            System.out.println("Authentication failed");
            return false;
        }

        System.out.println("Authentication successful");
        return true;
    }
}