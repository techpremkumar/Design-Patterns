public class ShippedState implements OrderState {

    public void confirm(Order order) {
        System.out.println("Order is already shipped");
    }

    public void ship(Order order) {
        System.out.println("Order is already shipped");
    }

    public void deliver(Order order) {
        System.out.println("Order delivered");
        order.setState(new DeliveredState());
    }
}