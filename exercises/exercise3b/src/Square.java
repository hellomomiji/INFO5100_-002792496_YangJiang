
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

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Square) {
      Square thatSquare = (Square) obj;
      return color.equals(thatSquare.color) && Double.valueOf(length).equals(thatSquare.length);
    }
    return false;
  }
}
