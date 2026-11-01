public class OrderBuilder {
    int orderId;
    String customerName;
    String productName;
    String address;
    String couponCode;
    boolean giftWrapping;

    public OrderBuilder setOrderId(int orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public OrderBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public OrderBuilder setCouponCode(String couponCode) {
        this.couponCode = couponCode;
        return this;
    }

    public OrderBuilder setGiftWrapping(boolean giftWrapping) {
        this.giftWrapping = giftWrapping;
        return this;
    }

    // Final object creation
    public Order build() {
        return new Order(this);
    }
}