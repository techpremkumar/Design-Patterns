public interface LoggerMixin {

    default void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}