/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-02 22:48:34
 */
public class Solution {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int x : nums) sum += x;
        return (nums.length * (nums.length + 1)) / 2 - sum;
    }
}
