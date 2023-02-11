package exercise0;

public class Computer {
    int id;
    String brand;
    String model;
    String color;

    String chip;
    Integer year;
    Integer memory;
    String os;
    Integer storage;

    public Computer(int id, String brand, String model, String color, String chip, Integer year, Integer memory,
            String os,
            Integer storage) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.chip = chip;
        this.year = year;
        this.memory = memory;
        this.os = os;
        this.storage = storage;
        System.out.println("Created Computer: " + this.id);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Computer macAir = new Computer(1, "Apple", "Macbook Air", "Space Gray", "Apple M2", 2023, 16, "macOS", 256);
        Computer macPro = new Computer(2, "Apple", "Macbook Pro", "Silver", "Apple M2", 2023, 16, "macOS", 512);
        Computer surface = new Computer(3, "Microsoft", "Surface Pro", "Black", "Intel i7", 2023, 32, "Windows11", 512);

    }

}
