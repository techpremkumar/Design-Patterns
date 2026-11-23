public class CreatedState implements OrderState {

    public void confirm(Order order) {
        System.out.println("Order confirmed");
        order.setState(new ConfirmedState());
    }

    public void ship(Order order) {
        System.out.println("Cannot ship. Order is not confirmed.");
    }

    public void deliver(Order order) {
        System.out.println("Cannot deliver. Order is not shipped.");
    }
}