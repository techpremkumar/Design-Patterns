public class Main {

    public static void main(String[] args) {

        Order order = new Order();

        order.confirm();

        order.ship();

        order.deliver();

        order.ship();
    }
}