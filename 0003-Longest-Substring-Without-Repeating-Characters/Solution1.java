import java.util.HashMap;
import java.util.Map;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-17 17:07:12
 */
public class Solution1 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        char[] chs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int anchor = 0, longest = 1;
        for (int i = 0; i < chs.length; i++) {
            if (map.getOrDefault(chs[i], -1) >= anchor) {
                anchor = map.get(chs[i]) + 1;
            }

            map.put(chs[i], i);
            longest = Math.max(i - anchor + 1, longest);
        }

        return longest;
    }
}
