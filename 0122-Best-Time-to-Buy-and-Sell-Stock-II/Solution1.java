/**
 * 峰谷法
 *
 * 购买股票最好的时机是在价格处于谷底的时候，而卖出股票
 * 最好的时机实在价格处于峰值的时候。通过循环找出峰谷，
 * 这是典型的贪心算法思想
 *
 *  - 时间复杂度：O(n)
 *  - 空间复杂度：O(1)
 *
 * @author tianxiaobo
 * @date 2020/1/7
 */
public class Solution1 {

    public int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        int valley, peak;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) i++;
            peak = prices[i];
            profit += peak - valley;
        }
        return profit;
    }
}
