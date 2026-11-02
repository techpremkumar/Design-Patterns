public class Main {

    public static void main(String[] args) {

        TreeType tree1 =
                TreeFactory.getTree("Oak", "Green");

        tree1.draw(10, 20);

        TreeType tree2 =
                TreeFactory.getTree("Oak", "Green");

        tree2.draw(30, 40);

        TreeType tree3 =
                TreeFactory.getTree("Pine", "Dark Green");

        tree3.draw(50, 60);

        System.out.println(
            "Same object? " + (tree1 == tree2)
        );
    }
}