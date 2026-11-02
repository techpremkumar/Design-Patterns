public class Main {

    public static void main(String[] args) {

        Employee original =
                new Employee(101, "Prem", "IT");

        Employee clone = original.clone();

        clone.name = "Arun";
        clone.id = 102;

        System.out.println("Original Employee");
        original.display();

        System.out.println("\nCloned Employee");
        clone.display();
    }
}