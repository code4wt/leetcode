/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 20:28:40
 */
public class Solution {

    public int countPrimes(int n) {
        boolean[] map = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!map[i]) count++;
            for (int j = 2; i * j < n; j++) {
                map[i * j] = true;
            }
        }

        return count;
    }
}
