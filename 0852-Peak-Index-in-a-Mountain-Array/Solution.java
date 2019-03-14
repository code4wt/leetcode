/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-14 14:00:59
 */
public class Solution {

    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) return i;
        }
        return -1;
    }
}
