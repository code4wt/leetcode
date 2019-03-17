/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-17 17:59:16
 */
public class Solution1 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int y = x, z = 0;
        while (y > 0) {
            if (z > Integer.MAX_VALUE / 10) return false;

            z = z * 10 + y % 10;
            y /= 10;
        }

        return z == x;
    }
}
