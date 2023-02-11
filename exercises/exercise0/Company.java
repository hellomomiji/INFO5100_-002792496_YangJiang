package exercise0;

public class Company {
  String name;
  String ceoName;
  String founder;

  String industry;
  int founded;
  String headquarters;
  int numebrOfemployees;
  String mainProduct;

  public Company(String name, String ceoName, String founder, String industry, int founded, String headquarters,
      int numebrOfemployees, String mainProduct) {
    this.name = name;
    this.ceoName = ceoName;
    this.founder = founder;
    this.industry = industry;
    this.founded = founded;
    this.headquarters = headquarters;
    this.numebrOfemployees = numebrOfemployees;
    this.mainProduct = mainProduct;
    System.out.println("Created Company: " + this.name);
  }

  public String getName() {
    return name;
  }

  public String getCeoName() {
    return ceoName;
  }

  public String getFounder() {
    return founder;
  }

  public static void main(String[] args) {
    Company google = new Company("Google", "Sundar Pichai", "Larry Page, Sergey Brin", "Internet", 1998,
        "Montain View, CA", 140000, "YouTube");
    Company meta = new Company("Meta", "Mark Zuckerberg", "Mark Zuckerberg", "Internet", 2004, "Menlo Park, CA", 76000,
        "Facebook, Instagram");
    Company accenture = new Company("Accenture", "Juile Sweet", "", "Consulting", 1989, "Dublin, Ireland", 738000,
        "Consulting Service");
  }

}
