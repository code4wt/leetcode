/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-03-08 13:52:41
 */
public class Solution2 {

     public int rob(int[] nums) {
         if (nums == null || nums.length == 0) return 0;

         int[] help = new int[nums.length + 1];
         help[1] = nums[0];
         for (int i = 1; i < nums.length; i++) {
             help[i + 1] = Math.max(help[i], help[i - 1] + nums[i]);
         }
         return help[nums.length];
     }
}
