/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 18:15:01
 */
public class Solution2 {

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int i = 0;
        char[] chs = str.toCharArray();
        while (i < chs.length && chs[i] == ' ') {
            i++;
        }

        int sign = 1;
        if (i < chs.length && (chs[i] == '-' || chs[i] == '+')) {
            sign *= chs[i++] == '-' ? -1 : 1;
        }

        int base = 0;
        while (i < chs.length && chs[i] >= '0' && chs[i] <= '9') {
            if (base > Integer.MAX_VALUE / 10
                || (base == Integer.MAX_VALUE / 10 && chs[i] > '7')) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            base = base * 10 + (chs[i++] - '0');
        }

        return base * sign;
    }
}
