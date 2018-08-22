package Array1;

/*Учитывая длину массива int 3, если в массиве есть сразу 2, а затем 3,
        установите 3 элемента в 0. Верните измененный массив.
        fix23 ([1, 2, 3]) → [1, 2, 0]
        fix23 ([2, 3, 5]) → [2, 0, 5]
        fix23 ([1, 2, 1]) → [1, 2, 1]*/

import java.util.Arrays;

public class Fix23 {
    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if ((nums[i] == 2) && (nums[i + 1] == 3)) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Fix23 fi = new Fix23();
        int[] nums = {2, 3, 5};
        System.out.println(Arrays.toString(fi.fix23(nums)));
    }
}
