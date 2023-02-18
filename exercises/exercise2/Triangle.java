package exercise2;

public class Triangle extends Shape {
  private double base;
  private double height;
  public static final String NAME = "Triangle";

  public Triangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return 0.5 * base * height;
  }

  @Override
  public double calculatePerimeter() {
    // Not implemented
    return 0;
  }
}
