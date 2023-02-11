package exercise0;

public class Book {
  String title;
  String author;
  double rating;
  double price;
  String genres;
  int pages;
  String published;
  boolean hasAudiobookVersion;

  public Book(String title, String author, double rating, double price, String genres, int pages, String published,
      boolean hasAudiobookVersion) {
    this.title = title;
    this.author = author;
    this.rating = rating;
    this.price = price;
    this.genres = genres;
    this.pages = pages;
    this.published = published;
    this.hasAudiobookVersion = hasAudiobookVersion;
    System.out.println("Created Book: " + this.title);
  }

  public void printTitle() {
    System.out.println(title);
  }

  public void printPrice() {
    System.out.println(price);
  }

  public void printPublishData() {
    System.out.println(published);
  }

  public static void main(String[] args) {
    Book atlasOftheHeart = new Book("Atlas of the Heart", "Brene Brown", 4.35, 14.99, "Nonfiction", 301, "Nov 30 2021",
        true);
    Book buildingaSecondBrain = new Book("Building a Second Brain", "Tiago Forte", 4.13, 14.99, "Productivity", 272,
        "June 14 2022", true);
    Book tomorrow = new Book("Tomorrow, and Tomorrow, and Tomorrow", "Gabrielle Zevin", 4.32, 13.99, "Fiction", 416,
        "Jul 5 2022", true);
  }

}
