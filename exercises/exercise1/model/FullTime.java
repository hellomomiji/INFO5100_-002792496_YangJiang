package exercise1.model;

public class FullTime extends Student {
    int[] examScores;

    public FullTime(String name, int quizAmount) {
        super(name, quizAmount);
        // TODO Auto-generated constructor stub
        examScores = new int[2];
        setExamScores();
    }

    public int[] setExamScores() {
        for (int i = 0; i < examScores.length; i++) {
            examScores[i] = genreateScore();
        }
        return examScores;
    }

    @Override
    public boolean isFulltime() {
        return true;
    }

    public void printFulltimeExamScores() {
        String s = name + " ";
        for (int score : examScores) {
            s += score + " ";
        }
        System.out.println(s);
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println(name + " " + examScores[0] + " " + examScores[1]);
    }

}
