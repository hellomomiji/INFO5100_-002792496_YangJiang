package exercise5;


public class Main {
  public static void main(String[] args) {
    
    // Test Factory Method Pattern
    ComputerFactory cf = new ComputerFactory();
    Computer apple = cf.createComputer("Apple");
    Computer surface = cf.createComputer("Surface");
    Computer lenovo = cf.createComputer("Lenovo");
    System.out.println(apple.toString());
    System.out.println(surface);
    System.out.println(lenovo);
    
    // Test Builder Pattern
    Car mustung = new Car.CarBuilder()
                .setMaker("Ford")
                .setModel("Mustung")
                .setYear(2022)
                .buildCar();
    Car porsche = new Car.CarBuilder()
                .setMaker("Porsche")
                .setModel("911")
                .setYear(2022)
                .buildCar();
    System.out.println(mustung.toString());
    System.out.println(porsche.toString());

    // Test Composite Pattern
    Cocktail manhattan = new Cocktail("Manhattan", 20);
    Cocktail whiskeySour = new Cocktail("Whiskey Sour", 30);
    Whiskey hibiki = new Whiskey("Suntory Hibiki", 40);
    hibiki.addCocktail(manhattan);
    hibiki.addCocktail(whiskeySour);

    hibiki.showAlcoholDetails();

  }
  
}
