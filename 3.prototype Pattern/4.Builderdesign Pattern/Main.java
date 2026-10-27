
class Laptop {
    private final String processor;
    private final int ram;
    private final int storage;

    private Laptop(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    static class Builder {
        private String processor;
        private int ram;
        private int storage;

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }

    public void display() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }
}

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop.Builder()
                .processor("Intel i7")
                .ram(16)
                .storage(512)
                .build();

        laptop.display();
    }
}
