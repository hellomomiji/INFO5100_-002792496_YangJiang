package exercise0;

public class Aircraft {
  String name;
  String nationalOrigin;
  String firstFlight;
  String primaryUsers;
  boolean inService;
  int producted;
  int numberBuilt;
  int numberOfSeats;

  public Aircraft(String name, String nationalOrigin, String firstFlight, String primaryUsers, boolean inService,
      int producted, int numberBuilt, int numberOfSeats) {
    this.name = name;
    this.nationalOrigin = nationalOrigin;
    this.firstFlight = firstFlight;
    this.primaryUsers = primaryUsers;
    this.inService = inService;
    this.producted = producted;
    this.numberBuilt = numberBuilt;
    this.numberOfSeats = numberOfSeats;
    System.out.println("Created Aircraft: " + this.name);
  }

  public void printPrimaryUsers() {
    System.out.println(primaryUsers);
  }

  public void printName() {
    System.out.println(name);
  }

  public void printFirstProducedDate() {
    System.out.println(producted);
  }

  public static void main(String[] args) {
    Aircraft boeing787 = new Aircraft("Boeing 787 Dreamliner", "United States", "Dec.15 2009", "ANA, UA, JA, AA", true,
        2007, 1037, 300);
    Aircraft airbusa380 = new Aircraft("Airbus A380", "Multi-national", "Apr.27 2005",
        "Emirates, Singapore Airlines, Qantas", true, 2003, 254, 615);
    Aircraft boeing777 = new Aircraft("Boeing 777", "United States", "June 12, 1994",
        "Emirates, United Airlines, Air France", true, 1993, 1703, 318);
  }

}
