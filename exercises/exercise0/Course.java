package exercise0;

public class Course {
  String title;
  int courseNumber;
  String subject;
  int credit;
  String term;
  boolean isLivestream;
  String campus;
  int seats;

  public Course(String title, int courseNumber, String subject, int credit, String term, boolean isLivestream,
      String campus, int seats) {
    this.title = title;
    this.courseNumber = courseNumber;
    this.subject = subject;
    this.credit = credit;
    this.term = term;
    this.isLivestream = isLivestream;
    this.campus = campus;
    this.seats = seats;
    System.out.println("Created Course: " + this.title);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void printSeats() {
    System.out.println(seats);
  }

  public static void main(String[] args) {
    Course info6105 = new Course("Data Sci Eng Method", 6105, "Information systems", 4, "Summer", true, "Online", 50);
    Course info5001 = new Course("Application Modeling and Design", 5001, "Information systems", 4, "Spring", false,
        "Boston", 40);
    Course info6150 = new Course("Web Design and User Experience", 6150, "Information systems", 4, "Spring", true,
        "San Jose", 30);
  }

}
