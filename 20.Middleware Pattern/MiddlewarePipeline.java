import java.util.ArrayList;
import java.util.List;

public class MiddlewarePipeline {

    private List<Middleware> middlewares = new ArrayList<>();

    public void add(Middleware middleware) {
        middlewares.add(middleware);
    }

    public void execute(Request request) {

        for (Middleware middleware : middlewares) {
            if (!middleware.handle(request)) {
                System.out.println("Request rejected");
                return;
            }
        }

        System.out.println("Request reached controller");
    }
}