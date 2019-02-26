import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-02-26 20:13:25
 */
class Solution1 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i), 0);
            if (count == 0) {
                return false;
            }
            map.put(s.charAt(i), count - 1);
        }

        return true;
    }
}
