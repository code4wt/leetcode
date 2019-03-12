/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 13:52:00
 */
public class Solution {

    public int[] diStringMatch(String S) {
        int[] A = new int[S.length() + 1];
        int s = 0, e = S.length();
        for (int i = 0; i < S.length(); i++) {
            A[i] = S.charAt(i) == 'I' ? s++ : e--;
        }
        A[A.length - 1] = e;

        return A;
    }
}
