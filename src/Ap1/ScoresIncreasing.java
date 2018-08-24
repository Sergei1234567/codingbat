package Ap1;

public class ScoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ScoresIncreasing increasing = new ScoresIncreasing();
        int[] scores = {1, 3, 3};
        System.out.println(increasing.scoresIncreasing(scores));
    }
}
