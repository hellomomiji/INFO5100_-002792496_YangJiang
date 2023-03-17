public class Circle extends Shape {
    private double radius;
    public static final String NAME = "Circle";

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle thatCircle = (Circle) obj;
            return color.equals(thatCircle.color) && Double.valueOf(radius).equals(thatCircle.radius);
        }
        return false;

    }
}
