/**
 * 跳跃旋转
 *  - 时间复杂度：O(n)
 *  - 空间复杂度：O(1)
 * @author tainxiaobo
 * @date 2020/1/2
 */
public class Solution2 {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;  // count 表示已经旋转的元素数量，因此 count 需小于 nums.length。
        for (int start = 0; count < nums.length; start++) {
            int curPos = start;
            int curVal = nums[curPos];
            do {
                int nextPos = (curPos + k) % nums.length;
                int nextVal = nums[nextPos];
                nums[nextPos] = curVal;
                curVal = nextVal;
                curPos = nextPos;
                count++;
            } while (start != curPos);
        }
    }
}