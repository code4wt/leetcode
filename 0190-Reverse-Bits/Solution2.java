/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 17:14:51
 */
public class Solution2 {

    public int reverseBits(int n) {
        int m = 0;
        for (int i = 0; i < 32; i++) {
            m = (m << 1) | (n & 1);
            n = n >>> 1;
        }
        return m;
    }
}
