/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 18:21:18
 */
public class Solution2 {

    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return (n>0 && 1162261467%n == 0);
    }
}
