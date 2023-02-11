package exercise0;

public class Student {
  int studnetId;
  String name;
  University university;
  College college;
  int year;
  String gender;
  int age;
  Boolean isGraduated;

  public Student(int studnetId, String name, University university, College college, int year, String gender, int age,
      Boolean isGraduated) {
    this.studnetId = studnetId;
    this.name = name;
    this.university = university;
    this.college = college;
    this.year = year;
    this.gender = gender;
    this.age = age;
    this.isGraduated = isGraduated;
    System.out.println("Created Student: (id)" + this.studnetId);
  }

  /**
   * University
   */
  public static class University {
    String name;
    String country;

    public University(String name, String country) {
      this.name = name;
      this.country = country;
      System.out.println("Created University: " + this.name);
    }
  }

  /**
   * College
   */
  public static class College {
    String name;
    int numberOfStudent;

    public College(String name, int numberOfStudent) {
      this.name = name;
      this.numberOfStudent = numberOfStudent;
      System.out.println("Created College: " + this.name);
    }
  }

  public int getStudnetId() {
    return studnetId;
  }

  public String getName() {
    return name;
  }

  public void setIsGraduated(Boolean isGraduated) {
    this.isGraduated = isGraduated;
  }

  public static void main(String[] args) {
    University neu = new University("Northeastern University", "United States");
    College coe = new College("College of Engineering", 10000);
    College cs = new College("Khoury College of Computer Sciences", 10000);
    Student coeStudent1 = new Student(0, "Amy", neu, coe, 2022, "female", 22, false);
    Student coeStudent2 = new Student(1, "Bob", neu, coe, 2020, "male", 25, true);
    Student cStudent = new Student(2, "Cathy", neu, coe, 2021, "female", 28, false);
  }

}
