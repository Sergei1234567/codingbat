package Array1;

//Given an int array length 2, return true if it does not contain a 2 or 3.
//
//        no23([4, 5]) → true
//        no23([4, 2]) → false
//        no23([3, 5]) → false

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
