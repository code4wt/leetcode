import java.util.HashSet;
import java.util.Set;

/**
 * 哈希表
 *  - 时间复杂度：O(n)
 *  - 空间复杂度：O(n)
 *
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution1 {

     public int singleNumber(int[] nums) {
         Set<Integer> set = new HashSet<>();
         for (int num : nums) {
             if (set.contains(num))
                 set.remove(num);
             else
                 set.add(num);
         }
         return set.toArray(new Integer[0])[0];
     }
}
