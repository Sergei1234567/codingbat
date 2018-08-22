package Array1;

/*Учитывая массив из целых чисел нечетной длины, верните новую длину массива 3,
 содержащую элементы из середины массива. Длина массива будет не менее 3.
        midThree ([1, 2, 3, 4, 5]) → [2, 3, 4]
        midThree ([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        midThree ( [1, 2, 3]) → [1, 2, 3]*/

import java.util.Arrays;

public class MidThree {
    public int[] midThree(int[] nums) {
        int center = nums.length / 2 == 0 ? nums.length / 2 : nums.length / 2;
        int center1 = center - 1;
        int center2 = center + 1;
        return new int[]{nums[center1],nums[center],nums[center2]};
    }

    public static void main(String[] args) {
        MidThree three = new MidThree();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(three.midThree(nums)));
    }
}
