/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-13 13:07:38
 */
public class Solution1 {

    public int findComplement(int num) {
        int x = 0, y = num;
        while (y > 0) {
            x = x << 1 | 1;
            y = y >> 1;
        }
        return x ^ num;
    }
}
