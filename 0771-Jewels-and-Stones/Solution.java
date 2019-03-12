import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 09:43:40
 */
public class Solution {

    public int numJewelsInStones(String J, String S) {
        if (J == null || J.isEmpty() || S == null || S.isEmpty()) return 0;

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : S.toCharArray()) {
            map.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }
        int count = 0;
        for (char ch : J.toCharArray()) {
            count += map.getOrDefault(ch, 0);
        }

        return count;
    }
}
