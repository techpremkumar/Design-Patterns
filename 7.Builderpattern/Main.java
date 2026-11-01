public class Main {

    public static void main(String[] args) {

        Order order = new OrderBuilder()
                .setOrderId(101)
                .setCustomerName("Prem")
                .setProductName("Laptop")
                .setAddress("Chennai")
                .setCouponCode("SAVE10")
                .setGiftWrapping(true)
                .build();

        order.display();
    }
}