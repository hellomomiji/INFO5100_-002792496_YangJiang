package exercise5;

// factory method pattern
  
public interface Computer {
  String getName();
  int getPrice();
} 

class Apple implements Computer {

  @Override
  public String getName() {
    return "Apple";
  }

  @Override
  public int getPrice() {
    return 1299;
  }

  @Override
  public String toString() {
    return "Name: " + getName() + " Price: " + getPrice();
  }
}

class Surface implements Computer {
  @Override
  public String getName() {
    return "Surface";
  }
  @Override
  public int getPrice() {
    return 899;
  }

  @Override
  public String toString() {
    return "Name: " + getName() + " Price: " + getPrice();
  }
}

class Lenovo implements Computer {
  @Override
  public String getName() {
    return "Lenovo";
  }

  @Override
  public int getPrice() {
    return 799;
  }

  @Override
  public String toString() {
    return "Name: " + getName() + " Price: " + getPrice();
  }
}

class ComputerFactory {
  public Computer createComputer(String name) {
    switch (name) {
      case "Apple":
        return new Apple();
      case "Surface":
        return new Surface();
      case "Lenovo":
        return new Lenovo();
      default:
        throw new IllegalArgumentException();
    }
  }
  
}
