import java.util.HashSet;
import java.util.Set;

/**
 * 数学方法，2 * (a + b + c) - (a + a + b + b + c) = c
 *  - 时间复杂度：O(n)
 *  - 空间复杂度：O(n)
 *
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution2 {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num : nums) {
            set.add(num);
            sum += num;
        }
        return 2 * set.stream().mapToInt(Integer::intValue).sum() - sum;
    }
}
