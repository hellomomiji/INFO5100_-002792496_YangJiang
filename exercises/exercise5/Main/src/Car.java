package exercise5;

// Builder Pattern

public class Car {
  String maker;
  String model;
  int year;

  
  Car(CarBuilder builder) {
    this.maker = builder.maker;
    this.model = builder.model;
    this.year = builder.year;
  }

  @Override
  public String toString() {
    return "Car: " + maker + " " + model + " " + year;
  }
  
  public String getMaker() {
    return maker;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  public static class CarBuilder {
    String maker;
    String model;
    int year;

    public CarBuilder setMaker(String maker) {
      this.maker = maker;
      return this;
    }

    public CarBuilder setModel(String model) {
      this.model = model;
      return this;
    }

    public CarBuilder setYear(int year) {
      this.year = year;
      return this;
    }

    public Car buildCar() {
      return new Car(this);
    }
  }
  
}