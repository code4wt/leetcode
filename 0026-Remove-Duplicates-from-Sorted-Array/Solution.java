import java.util.Objects;

/**
 * 题目里明确了 nums 是排序的，这样可以保证相同的数字是连续出现的。
 * 不会出现 [1,1,2,1]，否则无法通过双指针法进行处理。对于乱序数组，
 * 可以考虑先排序，然后再使用双指针法处理。如果允许使用额外空间，
 * 则也可通过双指针 + Set 进行处理
 *
 * @author tianxiaobo
 * @date 2020/1/2
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (Objects.isNull(nums) || nums.length == 0) return 0;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) nums[++index] = nums[i];
        }
        return index + 1;
    }
}
