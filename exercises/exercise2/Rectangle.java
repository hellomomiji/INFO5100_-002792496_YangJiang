package exercise2;

public class Rectangle extends Shape {
  private double width;
  private double height;
  public static final String NAME = "Rectangle";

  public Rectangle(String color, double width, double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * (width + height);
  }
}
