public class Main {

    public static void main(String[] args) {

        CustomerRepository repository =
                new InMemoryCustomerRepository();

        CustomerService service =
                new CustomerService(repository);

        service.registerCustomer(
                new Customer(101, "Arun")
        );

        service.registerCustomer(
                new Customer(102, "Kumar")
        );

        service.displayCustomer(101);
    }
}