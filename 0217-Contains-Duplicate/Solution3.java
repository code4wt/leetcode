import java.util.Arrays;

/**
 * 排序法
 *  - 时间复杂度：O(nlogn)
 *  - 时间复杂度：使用堆排序，复杂度为 O(1)
 *
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution3 {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i+1]) return true;
        return false;
    }
}
