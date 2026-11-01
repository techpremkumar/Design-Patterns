
class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database connection created");
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to database");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        DatabaseConnection db1 =
                DatabaseConnection.getInstance();

        DatabaseConnection db2 =
                DatabaseConnection.getInstance();

        db1.connect();

        System.out.println(db1 == db2);
    }
}
