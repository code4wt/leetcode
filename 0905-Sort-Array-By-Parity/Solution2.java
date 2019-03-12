import java.util.Arrays;
import java.util.Comparator;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 16:34:16
 */
public class Solution2 {

    public int[] sortArrayByParity(int[] A) {
        return Arrays.stream(A)
            .boxed()
            .sorted(Comparator.comparingInt(x -> x % 2))
            .mapToInt(x -> x)
            .toArray();
    }
}
