public class ConfirmedState implements OrderState {

    public void confirm(Order order) {
        System.out.println("Order is already confirmed");
    }

    public void ship(Order order) {
        System.out.println("Order shipped");
        order.setState(new ShippedState());
    }

    public void deliver(Order order) {
        System.out.println("Cannot deliver. Order is not shipped.");
    }
}