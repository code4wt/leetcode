import java.util.HashSet;
import java.util.Set;

/**
 * 通过 Set 集合判断是否包含重复元素
 *  - 时间复杂度：O(n)
 *  - 空间复杂度：O(n)
 *
 * @author tainxiaobo
 * @date 2020/1/5
 */
public class Solution1 {

    public boolean containsDuplicate(int[] nums) {
         Set<Integer> set = new HashSet<>();
         for (int num : nums) {
             if (set.contains(num)) return true;
             set.add(num);
         }
         return false;
     }
}
