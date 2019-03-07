/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-07 21:27:43
 */
public class Solution2 {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int maxProfit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }

        return maxProfit;
    }
}
