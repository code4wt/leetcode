/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-03-04 23:39:01
 */
public class Solution2 {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
