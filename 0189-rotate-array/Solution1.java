/**
 * 暴力逐个旋转
 *  - 时间复杂度：O(k*n)
 *  - 空间复杂度：O(1)
 * @author tainxiaobo
 * @date 2020/1/2
 */
public class Solution1 {
    public void rotate(int[] nums, int k) {
        // 旋转 nums.length 次，等价于不旋转，此处优化一下减少旋转次数
        k %= nums.length;
        for (int i = 0; i < k; i++) {
            int tmp = nums[nums.length - 1];
            for (int j = nums.length - 2; j >= 0; j--) nums[j + 1] = nums[j];
            nums[0] = tmp;
        }
    }
}
