package Array2;

/*При заданных массивах nums1 и nums2 той же длины для каждого элемента в nums1
        рассмотрим соответствующий элемент в nums2 (в том же индексе). Возвращает счетчик количества раз,
        когда два элемента отличаются на 2 или меньше, но не равны.
        matchUp ([1, 2, 3], [2, 3, 10]) → 2
        matchUp ([1, 2, 3], [2, 3, 5]) → 3
        matchUp ([1, 2, 3], [2, 3, 3]) → 2*/

public class MatchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MatchUp match = new MatchUp();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 10};
        System.out.println(match.matchUp(nums1, nums2));
    }
}
