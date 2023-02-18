package exercise2;

public class Square extends Shape {
  private double height;
  public static final String NAME = "Square";

  public Square(String color, double height) {
    super(color);
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return height * height;
  }

  @Override
  public double calculatePerimeter() {
    return 4 * height;
  }
}
