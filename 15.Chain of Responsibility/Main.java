public class Main {

    public static void main(String[] args) {

        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        manager.approve(5000);
        manager.approve(25000);
        manager.approve(75000);
    }
}