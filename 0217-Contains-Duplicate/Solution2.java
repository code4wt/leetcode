/**
 * 暴力搜索法检测是否包含重复元素
 *  - 时间复杂度：O(n^2)
 *  - 空间复杂度：O(1)
 *
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution2 {

     public boolean containsDuplicate(int[] nums) {
         for (int i = 0; i < nums.length; i++)
             for (int j = i + 1; j < nums.length; j++)
                 if (nums[i] == nums[j]) return true;

         return false;
     }
}
