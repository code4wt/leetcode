/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-04 23:18:50
 */
public class Solution1 {

    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i <= j && j >= 0; ) {
            if (nums[i] != val) {
                i++;
                continue;
            }
            if (nums[j] == val) {
                j--;
                continue;
            }

            nums[i++] = nums[j--];
        }

        return j + 1;
    }

    public static void main(String[] args) {
        new Solution1().removeElement(new int[]{3, 2, 2, 3}, 3);
    }
}
