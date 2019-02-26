/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-26 13:24:44
 */
public class Solution3 {

    public int reverse(int x) {
        int k = 0;
        while (x != 0) {
            if (k > Integer.MAX_VALUE / 10 || k < Integer.MIN_VALUE / 10) {
                return 0;
            }

            k = k * 10 + x % 10;
            x /= 10;
        }

        return k;
    }
}