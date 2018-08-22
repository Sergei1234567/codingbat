package Array1;

/*Учитывая длину массива int 2, верните true, если он не содержит 2 или 3.
        no23 ([4, 5]) → true
        no23 ([4, 2]) → false
        no23 ([3, 5]) → false*/

import java.util.Arrays;

public class No23 {
    private static boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 || nums[i] == 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2};
        System.out.println(no23(nums));
    }
}
