package exercise0;

public class Apartment {
  String name;
  String contactNumber;
  String city;
  int zipcode;
  int floor;
  int rooms;
  Company company;
  Boolean withParkingLot;
  double rentalFeeStartFrom;

  public Apartment(String name, String contactNumber, String city, int zipcode, int floor, int rooms, Company company,
      Boolean withParkingLot, double rentalFeeStartFrom) {
    this.name = name;
    this.contactNumber = contactNumber;
    this.city = city;
    this.zipcode = zipcode;
    this.floor = floor;
    this.rooms = rooms;
    this.company = company;
    this.withParkingLot = withParkingLot;
    this.rentalFeeStartFrom = rentalFeeStartFrom;
    System.out.println("Created Apartment: " + this.name);
  }

  /**
   * Company
   */
  public static class Company {
    String name;
    String location;
    int numberOfPropertiesOwned;

    public Company(String name, String location, int numberOfPropertiesOwned) {
      this.name = name;
      this.location = location;
      this.numberOfPropertiesOwned = numberOfPropertiesOwned;
      System.out.println("Created Property Company: " + this.name);
    }
  }

  public void printName() {
    System.out.println(name);
  }

  public void printContactNumber() {
    System.out.println(contactNumber);
  }

  public void printCity() {
    System.out.println(city);
  }

  public static void main(String[] args) {
    Company irvine = new Company("Irvine", "Santa Clara", 10);
    Apartment santaClaraSqure = new Apartment("Santa Clara Squre", "8447333212", "Santa Clara", 95051, 5, 500, irvine,
        true, 3150);
    Apartment Monticello = new Apartment("Monticello", "8446748334", "Santa Clara", 95051, 4, 300, irvine, true, 3060);
    Company prometheus = new Company("Prometheus", "Sen Mateo", 30);
    Apartment montrose = new Apartment("Montrose", "8558099065", "Mountain View", 94040, 4, 150, prometheus, true,
        3166);
  }
}
