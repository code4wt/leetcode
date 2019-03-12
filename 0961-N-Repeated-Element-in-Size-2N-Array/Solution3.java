import java.util.HashSet;
import java.util.Set;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 18:05:37
 */
public class Solution3 {

    public int repeatedNTimes(int[] A) {
        for (int k = 1; k <= 3; ++k) {
            for (int i = 0; i < A.length - k; ++i) {
                if (A[i] == A[i+k]) return A[i];
            }
        }

        return 0;
    }
}
