package Array1;

/*Учитывая массив ints, верните true, если 6 появляется
как первый или последний элемент в массиве.
Массив будет длиной 1 или больше.*/
       /* firstLast6 ([1, 2, 6]) → true
        firstLast6 ([6, 1, 2, 3]) → true
        firstLast6 ([13, ​​6, 1, 2, 3]) → false*/


public class FirstLast {
    private static boolean firstLast6(int[] nums) {
     /*   if (nums[0] == 6) {
            return true;
        }
        if (nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }*/
        return (nums [0] == 6 || nums [nums.length - 1] == 6);
    }

    public static void main(String[] args) {
        int[] num = {5, 1, 2, 6};
        System.out.println(FirstLast.firstLast6(num));
    }
}
