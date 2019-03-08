/**
 * Solution3
 *
 * @author Tian ZhongBo
 * @date 2019-03-08 13:53:22
 */
public class Solution3 {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int pre = 0, cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmp = cur;
            cur = Math.max(cur, pre + nums[i]);
            pre = tmp;
        }
        return cur;
    }
}
