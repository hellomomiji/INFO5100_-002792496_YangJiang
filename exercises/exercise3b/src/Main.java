import java.io.*;

public class Main {
  public static void main(String[] args) {

    Circle circle = new Circle("red", 0);
    Rectangle rectangle = new Rectangle("blue", 3, 5);
    Square square = new Square("yellow", 4);
    Triangle triangle = new Triangle("green", 3, 5, 3, 4, 5);

    // Serialize
    try {
      FileOutputStream fileOut = new FileOutputStream("/tmp/shapes.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(circle);
      out.writeObject(rectangle);
      out.writeObject(square);
      out.writeObject(triangle);
      out.close();
      fileOut.close();
      System.out.println("Serialized data saved in /tmp/shapes.ser");

    } catch (IOException i) {
      // TODO: handle exception
      i.printStackTrace();
    }

    // Deserialize
    try {
      FileInputStream fileIn = new FileInputStream("/tmp/shapes.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      Shape shape1 = (Shape) in.readObject();
      Shape shape2 = (Shape) in.readObject();
      Shape shape3 = (Shape) in.readObject();
      Shape shape4 = (Shape) in.readObject();
      in.close();
      fileIn.close();

      System.out.println("Deserialized Shape: ");
      System.out.println(circle.equals(shape1));
      System.out.println(rectangle.equals(shape2));
      System.out.println(square.equals(shape3));
      System.out.println(triangle.equals(shape4));
    } catch (IOException i) {
      // TODO: handle exception
      i.printStackTrace();
      return;
    } catch (ClassNotFoundException c) {
      System.out.println("Shape Not Found.");
      c.printStackTrace();
      return;
    }

  }
}
