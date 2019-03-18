import java.util.HashMap;
import java.util.Map;

/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-03-18 14:04:19
 */
public class Solution2 {

    private Map<Character, Integer> map = new HashMap<>();

    public Solution() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) return 0;

        int num = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            int cur = map.get(chs[i]);
            if (i < chs.length - 1 && cur < map.get(chs[i + 1])) {
                num -= cur;
            } else {
                num += cur;
            }
        }

        return num;
    }
}
