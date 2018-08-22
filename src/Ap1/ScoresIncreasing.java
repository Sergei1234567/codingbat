package Ap1;

/*Учитывая массив баллов, верните true, если каждый балл равен или больше, чем раньше. Массив будет длиной 2 или более.
        scoresIncreasing ([1, 3, 4]) → true
        scoresIncreasing ([1, 3, 2]) → false
        scoresIncreasing ([1, 1, 4]) → true*/

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
