public class Tree implements TreeType {

    private String name;
    private String color;

    public Tree(String name, String color) {
        this.name = name;
        this.color = color;

        System.out.println("Creating Tree: " + name);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(
            name + " Tree at (" + x + ", " + y + ")"
        );
    }
}