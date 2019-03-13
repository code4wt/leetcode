/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-13 13:07:38
 */
public class Solution3 {

    public int findComplement(int num) {
        int x = 1;
        while (x < num) {
            x = x << 1;
        }
        return x - 1 - num;
    }
}
