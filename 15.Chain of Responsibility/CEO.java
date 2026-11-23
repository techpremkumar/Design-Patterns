public class CEO extends Approver {

    @Override
    public void approve(double amount) {

        if (amount > 50000) {
            System.out.println("CEO approved ₹" + amount);
        } else if (nextApprover != null) {
            nextApprover.approve(amount);
        }
    }
}