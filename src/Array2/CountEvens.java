package Array2;

/*Возвращает число четных int в заданном массиве.
 Примечание: оператор% «mod» вычисляет остаток, например 5% 2 равен 1.
        countEvens ([2, 1, 2, 3, 4]) → 3
        countEvens ([2, 2, 0]) → 3
        countEvens ([1, 3, 5]) → 0*/

public class CountEvens {
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 4};
        System.out.println(countEvens(nums));
    }
}
