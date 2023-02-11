package exercise0;

public class Car {
    String modelName;
    String manufacturer;
    Integer year;
    String color;
    Integer numberOfDoors;
    Boolean isConvertible;
    Integer weights;
    String motorType;

    public Car(String modelName, String manufacturer, Integer year, String color, Integer numberOfDoors,
            Boolean isConvertible, Integer weights, String motorType) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
        this.weights = weights;
        this.motorType = motorType;
        System.out.println("Created Car: " + this.modelName);
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String printIsConvertible() {
        String check = isConvertible ? "is convertible" : "is not convertible";
        return "This car " + check;
    }

    public Boolean isVintageCar() {
        return year < 2000 ? true : false;
    }

    public static void main(String[] args) {
        Car mustang = new Car("Mustang", "Ford", 2022, "Black", 2, true, 4400, "fuel");
        Car audiR8 = new Car("R8", "Audi", 2022, "Silver", 2, false, 3600, "fuel");
        Car proscheTaycan = new Car("Taycan", "Porsche", 2022, "Red", 4, false, 4600, "electric");

    }

}
