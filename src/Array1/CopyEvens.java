package Array1;

/*Учитывая массив положительных ints, верните новый массив «count» длины,
        содержащий первые четные числа из исходного массива.
        Исходный массив будет содержать, по крайней мере, «подсчет» четных чисел.
        copyEvens ([3, 2, 4, 5, 8], 2) → [2, 4]
        copyEvens ([3, 2, 4, 5, 8], 3) → [2, 4, 8]
        copyEvens ([6 , 1, 2, 4, 5, 8], 3) → [6, 2, 4]*/

import java.util.Arrays;

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for (int i = 0; index < count; i++) {
            if (nums[i] % 2 == 0) {
                arr[index] = nums[i];
                index++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        CopyEvens evens = new CopyEvens();
        int[] nums = {6, 1, 2, 4, 5, 8};
        System.out.println(Arrays.toString(evens.copyEvens(nums, 4)));
    }
}
