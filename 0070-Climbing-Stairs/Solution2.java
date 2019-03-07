/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-07 20:24:17
 */
public class Solution2 {

    public int climbStairs(int n) {
        int[] ways = {1, 1};
        for (int i = 1; i < n; i++) {
            int temp = ways[1];
            ways[1] += ways[0];
            ways[0] = temp;
        }
        return ways[1];
    }
}
