/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-14 13:38:19
 */
public class Solution {

    public int minDeletionSize(String[] A) {
        if (A == null || A.length == 0) return 0;

        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) < A[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
