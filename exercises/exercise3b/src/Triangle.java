
public class Triangle extends Shape {
  private double base;
  private double height;
  private double sideA;
  private double sideB;
  private double sideC;
  public static final String NAME = "Triangle";

  public Triangle(String color, double base, double height, double sideA, double sideB, double sideC) {
    super(color);
    this.base = base;
    this.height = height;
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  @Override
  public double calculateArea() {
    return 0.5 * base * height;
  }

  @Override
  public double calculatePerimeter() {
    return sideA + sideB + sideC;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Triangle) {
      Triangle thatTriangle = (Triangle) obj;
      return color.equals(thatTriangle.color) 
            && Double.valueOf(base).equals(thatTriangle.base)
            && Double.valueOf(height).equals(thatTriangle.height)
            && Double.valueOf(sideA).equals(thatTriangle.sideA)
            && Double.valueOf(sideB).equals(thatTriangle.sideB)
            && Double.valueOf(sideC).equals(thatTriangle.sideC);
    }
    return false;
  }
}
