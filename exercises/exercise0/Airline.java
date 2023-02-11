package exercise0;

public class Airline {
  String name;
  String icao;
  String country;
  String hubs;
  boolean isStarAlliance;
  int destinations;
  int fleetSize;
  int numberOfEmployees;

  public Airline(String name, String icao, String country, String hubs, boolean isStarAlliance, int destinations,
      int fleetSize, int numberOfEmployees) {
    this.name = name;
    this.icao = icao;
    this.country = country;
    this.hubs = hubs;
    this.isStarAlliance = isStarAlliance;
    this.destinations = destinations;
    this.fleetSize = fleetSize;
    this.numberOfEmployees = numberOfEmployees;
    System.out.println("Created Airline: " + this.name);
  }

  public void printName() {
    System.out.println(name);
  }

  public void printIcao() {
    System.out.println(icao);
  }

  public void printHubs() {
    System.out.println(hubs);
  }

  public static void main(String[] args) {
    Airline ana = new Airline("All Nippon Airways", "ANA", "Japan", "Tokyo-Haneda", true, 104, 212, 46000);
    Airline ual = new Airline("United Airlines", "UAL", "United States", "Chicago, Denver, Guam", true, 342, 851,
        84100);
    Airline uae = new Airline("Emirates", "UAE", "United Arab Emirates", "Dubai", false, 152, 262, 75145);
  }

}
