/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-08 13:52:11
 */
public class Solution1 {

     public int rob(int[] nums) {
         if (nums == null || nums.length == 0) return 0;
         if (nums.length == 1) return nums[0];

         int len = nums.length;
         int[] profits = new int[len];
         for (int i = 0; i < len; i++) {
             if (i - 2 < 0) {
                 profits[i] = nums[i];
             } else if (i - 3 < 0) {
                 profits[i] = nums[i - 2] + nums[i];
             } else {
                 profits[i] = nums[i] + Math.max(profits[i - 2], profits[i - 3]);
             }
         }

         return Math.max(profits[len - 1], profits[len - 2]);
     }
}
