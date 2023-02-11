package exercise0;

public class Movie {
  String name;
  int year;
  String director;
  String star;
  String country;
  double imdbRating;
  String genre;
  int duration;

  public Movie(String name, int year, String director, String star, String country, double imdbRating, String genre,
      int duration) {
    this.name = name;
    this.year = year;
    this.director = director;
    this.star = star;
    this.country = country;
    this.imdbRating = imdbRating;
    this.genre = genre;
    this.duration = duration;
    System.out.println("Created Moive: " + this.name);
  }

  public double getImdbRating() {
    return imdbRating;
  }

  public String getDirector() {
    return director;
  }

  public String getStar() {
    return star;
  }

  public static void main(String[] args) {
    Movie theDarkKnight = new Movie("The Dark Knight", 2008, "Christopher Nolan", "Christian Bale", "US", 9.0, "Action",
        152);
    Movie pulpFiction = new Movie("Pulp Fiction", 1994, "Quentin Tarantino", "John Travolta", "USA", 8.9, "Crime", 154);
    Movie fightClub = new Movie("Fight Club", 1999, "David Fincher", "Brad Pitt", "USA", 8.8, "Drama", 139);
  }

}
