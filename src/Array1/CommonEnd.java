package Array1;

/*Учитывая 2 массива ints, a и b, верните true,
        если они имеют один и тот же первый элемент или имеют один и тот
        же последний элемент. Оба массива будут иметь длину 1 или больше.
        commonEnd ([1, 2, 3], [7, 3]) → true
        commonEnd ([1, 2, 3], [7, 3, 2]) → false
        commonEnd ([1, 2, 3], [1 , 3]) → true*/

import java.util.Arrays;

public class CommonEnd {
    private static boolean commonEnd(int[] a, int[] b) {
        Arrays.equals(a, b);
        if (a[0] == b[0]) {
            return true;
        }
        if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(commonEnd(a, b));
    }
}
