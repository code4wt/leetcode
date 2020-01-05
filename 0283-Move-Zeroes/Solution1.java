/**
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution1 {

    public void moveZeroes(int[] nums) {
        int nonZeroLastIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[nonZeroLastIndex++] = nums[i];
        }
        for (int i = nonZeroLastIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
