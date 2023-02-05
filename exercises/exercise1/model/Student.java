package exercise1.model;

import java.util.ArrayList;
import java.util.Random;

abstract public class Student {
    String name;
    ArrayList<Integer> quizScores;

    public Student(String name, int quizAmount) {
        this.name = name;
        this.quizScores = new ArrayList<>();
        setQuizScores(quizAmount);
    }

    public ArrayList<Integer> getQuizScores() {
        return quizScores;
    }

    public String getName() {
        return name;
    }

    public int genreateScore() {
        Random random = new Random();
        int randomScore = random.nextInt(50) + 50;
        return randomScore;
    }

    public void setQuizScores(int quizAmount) {
        for (int i = 0; i < quizAmount; i++) {
            quizScores.add(genreateScore());
        }
    }

    public boolean isFulltime() {
        return false;
    }

    abstract public void print();
}
