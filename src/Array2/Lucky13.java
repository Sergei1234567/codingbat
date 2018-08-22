package Array2;

/*Учитывая массив ints, верните true, если массив содержит no 1 и no 3's.
        lucky13 ([0, 2, 4]) → true
        lucky13 ([1, 2, 3]) → false
        lucky13 ([1, 2, 4]) → false*/

public class Lucky13 {
    private  boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 || nums[i] == 3){
                return false;
            }else {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lucky13 lu = new Lucky13();
        int[] nums = {1, 2, 3};
        System.out.println(lu.lucky13(nums));
    }
}
