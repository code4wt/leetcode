
/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 16:18:57
 */
public class Solution1 {

    public int hammingWeight(int n) {
        int w = 0;
        while (n != 0) {
            w += n & 1;
            n = n >>> 1;
        }
        return w;
    }
}
