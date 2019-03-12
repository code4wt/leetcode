import java.util.HashSet;
import java.util.Set;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 18:05:37
 */
public class Solution2 {

    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int x : A ) {
            if (set.contains(x)) return x;
            set.add(x);
        }

        return 0;
    }
}
