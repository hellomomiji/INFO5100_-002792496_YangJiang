package exercise5;

import java.util.ArrayList;
import java.util.List;

// Composite Pattern

public interface Alcohol {
  void showAlcoholDetails();
}

class Cocktail implements Alcohol {
  String name;
  int abv;

  public Cocktail(String name, int abv) {
    this.name = name;
    this.abv = abv;
  }

  public void showAlcoholDetails() {
    System.out.println("Alcohol: " + name + " ABV: " + abv);
  }
}

class Whiskey implements Alcohol {
  String name;
  int abv;
  List<Alcohol> whiskeyCocktails = new ArrayList<Alcohol>();
  
  public Whiskey(String name, int abv) {
    this.name = name;
    this.abv = abv;
  }

  public void addCocktail(Alcohol drink) {
    whiskeyCocktails.add(drink);
  }

  public void removeCocktail(Alcohol drink) {
    whiskeyCocktails.remove(drink);
  }

  public void showAlcoholDetails() {
    System.out.println("Alcohol: " + name + " ABV: " + abv);
    for (Alcohol alcho : whiskeyCocktails) {
      alcho.showAlcoholDetails();
    }
  }
}
