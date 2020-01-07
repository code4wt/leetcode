/**
 * 反转法，过程如下：
 * 1.先将所有元素反转
 * 2.将前 k 个元素反转
 * 3.将剩下的元素反转
 *
 * 示例：
 * [1,2,3,4,5,6,7]
 *
 * 反转：
 * [7,6,5,4,4,2,1]
 * [5,6,7,4,3,2,1]
 * [5,6,7,1,2,3,4]
 *
 * - 时间复杂度：O(n)
 * - 空间复杂度：O(1)
 *
 * @author tianxiaobo
 * @date 2020/1/7
 */
public class Solution3 {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (end > start) {
            int tmp = nums[end];
            nums[end--] = nums[start];
            nums[start++] = tmp;
        }
    }
}
