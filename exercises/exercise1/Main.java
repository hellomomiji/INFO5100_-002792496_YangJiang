package exercise1;

import exercise1.model.Session;

public class Main {
    public static void main(String[] args) {
        Session session = new Session(20);

        session.printQuizScoreList();
        session.printPartTimeStudents();
        session.printExamScores();

    }

}
