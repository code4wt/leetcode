/**
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution2 {

    public void moveZeroes(int[] nums) {
        int nonZeroLastIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) swap(nums, nonZeroLastIndex++, i);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
