package exercise1.model;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

public class Session {
    public ArrayList<Student> students;
    ArrayList<Integer> quizScoreList;

    public Session(int TotalStudentsAmount) {
        this.students = new ArrayList<>();
        addStudents(TotalStudentsAmount);
        quizScoreList = new ArrayList<>();
    }

    public void addStudents(int total) {
        Random r = new Random();
        int fulltimeStudentAmount = r.nextInt(total);
        int parttimeStudentAmount = total - fulltimeStudentAmount;
        for (int i = 0; i < fulltimeStudentAmount; i++) {
            students.add(new FullTime("Full-Time-" + i, 15));
        }
        for (int i = 0; i < parttimeStudentAmount; i++) {
            students.add(new PartTime("Part-Time-" + i, 15));
        }
    }

    public int calculateAverageScore(Student s) {
        ArrayList<Integer> quizScores = s.getQuizScores();

        int sum = 0;
        for (Iterator<Integer> i = s.quizScores.iterator(); i.hasNext();) {
            sum += i.next();
        }
        int avg = sum / quizScores.size();
        return avg;
    }

    public void printQuizScoreList() {
        for (Student s : students) {
            for (int score: s.getQuizScores()) {
                quizScoreList.add(score);
            }
        }
        quizScoreList.sort(Comparator.naturalOrder());
        System.out.println("List of Quiz Scores \n =====");
        for (int s: quizScoreList) {
            System.out.println(s);
        }
    }

    public void printPartTimeStudents() {
        System.out.println("Students Names \n =====");
        students.stream().filter(Predicate.not(Student::isFulltime)).forEach(Student::print);
    }

    public void printExamScores() {
        System.out.println("Full-Time Student Exam Scores \n =====");
        students.stream().filter(Student::isFulltime).forEach(Student::print);
    }
    
}
