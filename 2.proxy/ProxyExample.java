
interface Video {
    void play();
}

class RealVideo implements Video {

    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        System.out.println("Loading video: " + fileName);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + fileName);
    }
}

class VideoProxy implements Video {

    private String fileName;
    private RealVideo realVideo;

    public VideoProxy(String fileName) {
        this.fileName = fileName;
        System.out.println("Proxy created");
    }

    @Override
    public void play() {

        if (realVideo == null) {
            realVideo = new RealVideo(fileName);
        }

        realVideo.play();
    }
}

public class ProxyExample {
    public static void main(String[] args) {

        Video video = new VideoProxy("movie.mp4");

        System.out.println("First call:");
        video.play();

        System.out.println("Second call:");
        video.play();
    }
}
