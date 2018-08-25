package Array1;

//Given an array of ints of even length, return a new array length 2 containing
//        the middle two elements from the original array. The original array will be length 2 or more.
//
//        makeMiddle([1, 2, 3, 4]) → [2, 3]
//        makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//        makeMiddle([1, 2]) → [1, 2]

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
