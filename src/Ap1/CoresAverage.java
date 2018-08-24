package Ap1;

public class CoresAverage {
    public int scoresAverage(int[] scores) {
        int first = average(scores, 0, scores.length / 2);
        int second = average(scores, scores.length / 2, scores.length);
        return Math.max(first, second);
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }

    public static void main(String[] args) {
        CoresAverage av = new CoresAverage();
        int[] scores = {3, 4, 5, 1, 2, 3};
        System.out.println(av.scoresAverage(scores));
    }
}
