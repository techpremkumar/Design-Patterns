public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void registerCustomer(Customer customer) {
        repository.save(customer);
        System.out.println("Customer registered successfully");
    }

    public void displayCustomer(int id) {

        Customer customer = repository.findById(id);

        if (customer != null) {
            System.out.println(
                customer.getId() + " - " + customer.getName()
            );
        } else {
            System.out.println("Customer not found");
        }
    }
}