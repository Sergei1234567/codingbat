package Array2;

/*Учитывая длину массива 1 или более из int, возвращаем разницу между наибольшими и наименьшими значениями в массиве.
 Примечание: встроенные методы Math.min (v1, v2) и Math.max (v1, v2) возвращают меньшее или большее из двух значений.
        bigDiff ([10, 3, 5, 6]) → 7
        bigDiff ([7, 2, 10, 9]) → 8
        bigDiff ([2, 10, 7, 2]) → 8*/

public class BigDiff {

    public int bigDiff(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        BigDiff diff = new BigDiff();
        int[] nums = {10, 3, 5, 6};
        System.out.println(diff.bigDiff(nums));
    }
}
