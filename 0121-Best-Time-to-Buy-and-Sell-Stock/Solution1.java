/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-07 21:27:43
 */
public class Solution1 {

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > max) max = profit;
            }
        }

        return max;
    }
}
