package Array2;

/*Возвращает сумму чисел в массиве, возвращая 0 для пустого массива.
За исключением числа 13 очень неудачно,
поэтому он не учитывается, и цифры, которые появляются сразу после 13, также не учитываются.
        sum13 ([1, 2, 2, 1]) → 6
        sum13 ([1, 1]) → 2
        sum13 ([1, 2, 2, 1, 13]) → 6*/

public class Sum13 {
    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 13){
                i++;
                continue;
            }
            if (nums[i] != 13) {
                sum += nums[i];
            }
            if(i > 0 && nums[i-1] == 13){
                sum -= nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 13, 1};
        System.out.println(sum13(nums));
    }
}
