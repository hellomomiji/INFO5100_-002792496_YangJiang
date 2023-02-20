package exercise2;

public class Square extends Shape {
  private double length;
  public static final String NAME = "Square";

  public Square(String color, double length) {
    super(color);
    this.length = length;
  }

  @Override
  public double calculateArea() {
    return length * length;
  }

  @Override
  public double calculatePerimeter() {
    return 4 * length;
  }
}
