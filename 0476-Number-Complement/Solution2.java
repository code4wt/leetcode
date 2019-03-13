/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-13 13:07:38
 */
public class Solution2 {

    public int findComplement(int num) {
        int x = 0;
        while (x < num) {
            x = x << 1 | 1;
        }
        return x ^ num;
    }
}
