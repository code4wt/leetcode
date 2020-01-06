import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 哈希法
 *
 * @author tianxiaobo
 * @date 2020/1/6
 */
public class Solution1 {

    public int[] intersect(int[] nums1, int[] nums2) {
         Map<Integer, Integer> map = new HashMap<>();
         for (int num : nums1) map.compute(num, (key, val) -> val == null ? 1 : val + 1);
         List<Integer> nums = new ArrayList<>();
         for (int num : nums2) {
             int val = map.getOrDefault(num, 0);
             if (val != 0) {
                 nums.add(num);
                 map.put(num, val - 1);
             }
         }
         return nums.stream().mapToInt(Integer::valueOf).toArray();
     }
}
