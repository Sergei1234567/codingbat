package Array1;

/*Учитывая массив из целых четных длин, возвращаем новую длину массива 2,
        содержащую средние два элемента из исходного массива. Исходный массив будет длиной 2 или более.
        makeMiddle ([1, 2, 3, 4]) → [2, 3]
        makeMiddle ([7, 1, 2, 3, 4, 9]) → [2, 3]
        makeMiddle ([1, 2]) → [ 1, 2]*/

import java.util.Arrays;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int center1 = nums.length / 2 == 0 ? nums.length / 2 : nums.length / 2;
        int center2 = center1 - 1;

    return new int[]{nums[center2], nums[center1]};
    }

    public static void main(String[] args) {
        MakeMiddle middle = new MakeMiddle();
        int[] nums = {1, 2};
        System.out.println(Arrays.toString(middle.makeMiddle(nums)));
    }
}
