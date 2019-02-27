/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 18:15:01
 */
public class Solution1 {

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        str = str.trim();
        boolean isMinus = str.startsWith("-") ? true : false;

        int i = (str.startsWith("+") || str.startsWith("-")) ? 1 : 0;
        int n = 0;
        for (; i < str.length(); i++) {
            int num = str.charAt(i) - 48;
            if (num < 0 || num > 9) {
                break;
            }

            if (n > Integer.MAX_VALUE / 10) {
                return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            if (isMinus && n * 10 + Integer.MIN_VALUE > 0 - num) {
                return Integer.MIN_VALUE;
            } else if (!isMinus && Integer.MAX_VALUE - n * 10 < num) {
                return Integer.MAX_VALUE;
            }

            n = n * 10 + num;
        }

        return isMinus ? 0 - n : n;
    }
}
