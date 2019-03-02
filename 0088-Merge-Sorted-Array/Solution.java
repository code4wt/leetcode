/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-02 10:11:54
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int insertP = m + n - 1;
        int p1 = m - 1, p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[insertP--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        while (p2 >= 0) {
            nums1[insertP--] = nums2[p2--];
        }
    }
}
