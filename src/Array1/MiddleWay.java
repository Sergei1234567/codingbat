package Array1;

/*Учитывая 2 массива int, a и b, каждая длина 3, возвращают новую длину массива 2,
        содержащую их средние элементы.
        ([7, 7, 7], [3, 8, 0]) → [7, 8]
        middleWay ( [1, 2, 3], [4, 5, 6]) → [2, 5] [5, 2, 9], [1, 4, 5]) → [2, 4]*/

import java.util.Arrays;

public class MiddleWay {
    private static int[] middleWay(int[] a, int[] b) {
        int center1 = a.length / 2 == 0 ? a.length / 2 : a.length / 2;
        int center2 = b.length / 2 == 0 ? b.length / 2 : b.length / 2;
        return new int[]{a[center1], b[center2]};
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7, 9};
        int[] b = {4, 5};
        System.out.println(Arrays.toString(middleWay(a, b)));
    }
}
