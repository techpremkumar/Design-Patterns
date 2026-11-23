public class DeliveredState implements OrderState {

    public void confirm(Order order) {
        System.out.println("Order is already delivered");
    }

    public void ship(Order order) {
        System.out.println("Cannot ship a delivered order");
    }

    public void deliver(Order order) {
        System.out.println("Order is already delivered");
    }
}