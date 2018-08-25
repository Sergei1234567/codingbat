package Array1;


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
