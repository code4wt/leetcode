/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 18:21:18
 */
public class Solution1 {

    public boolean isPowerOfThree(int n) {
        return n == 1 || n > 1 && n % 3 == 0 && isPowerOfThree(n / 3);
    }
}
