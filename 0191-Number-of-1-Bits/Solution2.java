/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 16:18:57
 */
public class Solution2 {

    public int hammingWeight(int n) {
        return (n & 1) + (n != 0 ? hammingWeight(n >>> 1) : 0);
    }
}
