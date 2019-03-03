/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 16:35:47
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        x ^= y;
        y = 0;
        while (x != 0) {
            y += x & 1;
            x = x >>> 1;
        }
        return y;
    }
}
