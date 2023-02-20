package exercise2;

public abstract class Shape {
  protected String color;

  public Shape(String color) {
    this.color = color;
  }

  public abstract double calculateArea();

  public abstract double calculatePerimeter();

}