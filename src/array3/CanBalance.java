package array3;

//Given a non-empty array, return true if there is a place to split the array
//        so that the sum of the numbers on one side is equal to the sum of the
//        numbers on the other side.
//
//        canBalance([1, 1, 1, 2, 1]) → true
//        canBalance([2, 1, 1, 2, 1]) → false
//        canBalance([10, 10]) → true

public class CanBalance {
    public boolean canBalance(int[] nums) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++)
            second += nums[i];

        for (int i = 0; i <= nums.length - 2; i++) {
            first += nums[i];
            second -= nums[i];

            if (first == second)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        CanBalance balance = new CanBalance();
        int[] nums = {2, 1, 1, 2, 1};
        System.out.println(balance.canBalance(nums));
    }
}
