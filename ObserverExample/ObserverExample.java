
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String video);
}

class Subscriber implements Observer {
    private String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String video) {
        System.out.println(
            name + " received notification: " + video
        );
    }
}

class YouTubeChannel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void uploadVideo(String video) {
        System.out.println("New video uploaded: " + video);

        for (Observer observer : subscribers) {
            observer.update(video);
        }
    }
}

public class ObserverExample {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();

        Observer user1 = new Subscriber("Alice");
        Observer user2 = new Subscriber("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("Java Design Patterns");
    }
}
