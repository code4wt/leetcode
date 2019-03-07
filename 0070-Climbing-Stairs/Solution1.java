/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-07 20:24:17
 */
public class Solution1 {

    public int climbStairs(int n) {
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for(int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}
