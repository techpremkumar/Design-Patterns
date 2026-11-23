public class Manager extends Approver {

    @Override
    public void approve(double amount) {

        if (amount <= 10000) {
            System.out.println("Manager approved ₹" + amount);
        } else if (nextApprover != null) {
            nextApprover.approve(amount);
        }
    }
}