
class Enemy implements Cloneable {
    String name;
    int health;

    Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public Enemy clone() {
        try {
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    void display() {
        System.out.println(name + " - Health: " + health);
    }
}

public class PrototypeExample {
    public static void main(String[] args) {
        Enemy original = new Enemy("Warrior", 100);

        Enemy enemy1 = original.clone();
        Enemy enemy2 = original.clone();

        enemy1.health = 80;

        original.display();
        enemy1.display();
        enemy2.display();

        System.out.println(original == enemy1);
    }
}
