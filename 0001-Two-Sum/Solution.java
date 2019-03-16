import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-16 20:50:33
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                return new int[]{map.get(sub), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
