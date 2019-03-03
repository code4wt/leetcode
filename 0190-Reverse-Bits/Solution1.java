/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 17:14:51
 */
public class Solution1 {

    public int reverseBits(int n) {
        for (int i = 0, j = 31; i < j; i++, j--) {
            int b1 = ((1 << j) & n) >>> (j - i);
            int b2 = ((1 << i) & n) << (j - i);
            n = ~(1 << j | 1 << i) & n | b1 | b2;
        }
        return n;
    }
}
