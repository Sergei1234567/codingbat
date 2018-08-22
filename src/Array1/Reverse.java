package Array1;
/*Учитывая массив из цепочки длиной 3,
 возвращаем новый массив с элементами в обратном порядке,
  поэтому {1, 2, 3} становится {3, 2, 1}.
        reverse3 ([1, 2, 3]) → [3, 2, 1]
        reverse3 ([5, 11, 9]) → [9, 11, 5]
        reverse3 ([7, 0, 0]) → [0, 0, 7]*/

import java.util.Arrays;

public class Reverse {
    private static int[] reverse3(int[] nums) {
        int[] n = new int[3];
        for (int i = 0; i < nums.length; i++) {
            n[i] = nums[nums.length - 1 - i];
        }
        return n;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(reverse3(nums)));
    }
}
