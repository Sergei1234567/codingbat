package Array1;

/*Мы скажем, что 1, за которым сразу следует 3 в массиве, является «неудачным». 1.
 Верните true, если данный массив содержит несчастливое 1 в первых двух или последних двух позициях в массиве.
        unlucky1 ([1, 3, 4, 5]) → true
        unlucky1 ([2, 1, 3, 4, 5]) → true
        unlucky1 ([1, 1, 1]) → false*/

import java.util.Arrays;

public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        if (nums.length >= 2 && (nums[0] == 1 && nums[1] == 3 || nums[nums.length - 2] == 1 &&
                nums[nums.length - 1] == 3)) {
            return true;
        }
        if (nums.length >= 3 && nums[1] == 1 && nums[2] == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Unlucky1 unlucky = new Unlucky1();
        int[] nums = {};
        System.out.println(unlucky.unlucky1(nums));
    }
}
