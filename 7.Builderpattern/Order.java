public class Order {

    private int orderId;
    private String customerName;
    private String productName;
    private String address;
    private String couponCode;
    private boolean giftWrapping;

    // Constructor
    public Order(OrderBuilder builder) {

        this.orderId = builder.orderId;
        this.customerName = builder.customerName;
        this.productName = builder.productName;
        this.address = builder.address;
        this.couponCode = builder.couponCode;
        this.giftWrapping = builder.giftWrapping;
    }

    // Display order details
    public void display() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Address: " + address);
        System.out.println("Coupon: " + couponCode);
        System.out.println("Gift Wrapping: " + giftWrapping);
    }
}