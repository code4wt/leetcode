import java.util.Arrays;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-10 20:55:27
 */
public class Solution2 {

    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i) {
            ans[i] = A[i] * A[i];
        }

        Arrays.sort(ans);
        return ans;
    }
}
