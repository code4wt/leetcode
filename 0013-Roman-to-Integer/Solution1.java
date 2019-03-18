import java.util.HashMap;
import java.util.Map;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-18 13:48:58
 */
public class Solution1 {

    private Map<Character, Integer> map = new HashMap<>();

    public Solution1() {
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

        int num = 0, prev = 0;
        char[] chs = s.toCharArray();
        for (int i = chs.length - 1; i >= 0; i--) {
            int d = map.get(chs[i]);
            num += d < prev ? 0 - d : d;
            prev = d;
        }

        return num;
    }
}
