package array3;

/*Рассмотрим самые левые и самые крайние появления некоторого значения в массиве.
 Мы скажем, что «span» - это количество элементов между двумя включенными.
 Единственное значение имеет диапазон 1. Возвращает наибольший диапазон, найденный в данном массиве.
 (Эффективность не является приоритетом.)
        maxSpan ([1, 2, 1, 1, 3]) → 4
        maxSpan ([1, 4, 2, 1, 4, 1, 4]) → 6
        maxSpan ([1, 4, 2, 1, 4, 4 , 4]) → 6*/

public class MaxSpan {
    public int maxSpan(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while(nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if(span > max)
                max = span;
        }

        return max;
    }

    public static void main(String[] args) {
        MaxSpan span = new MaxSpan();
        int[] nums = {1, 4, 2, 1, 4, 1, 4};
        System.out.println(span.maxSpan(nums));
    }
}
