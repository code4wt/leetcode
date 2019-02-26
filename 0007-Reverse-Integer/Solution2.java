import java.util.ArrayList;
import java.util.List;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-26 13:24:44
 */
public class Solution2 {

    public int reverse(int x) {
        int w = 1;
        for (int i = 1; i < 11; i++) {
            long p = (long) Math.pow(10, i);
            p = x < 0 ? 0L - p : p;
            if (x / p < 1) {
                w = i;
                break;
            }
        }

        long k = 0L;
        while (x != 0) {
            int s = x % 10;
            x /= 10;
            k += s * ((long) Math.pow(10, --w));

            if (k > (long) Integer.MAX_VALUE || k < (long) Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) k;
    }
}
