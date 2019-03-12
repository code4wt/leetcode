import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 18:05:37
 */
public class Solution1 {

    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(A).forEach(
            x -> map.compute(x, (k, v) -> v == null ? 1 : v + 1));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
