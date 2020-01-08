/**
 * 一次遍历法
 *
 * 将价格递增量（大于零）相加即为最大收益
 *
 *  - 时间复杂度：O(n)
 *  - 空间复杂度：O(1)
 *
 * @author tianxiaobo
 * @date 2020/1/8
 */
public class Solution2 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++)
            if (prices[i] < prices[i + 1])
                profit += prices[i + 1] - prices[i];
        return profit;
    }
}
