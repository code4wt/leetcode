import java.util.Arrays;

/**
 * @author tianxiaobo
 * @date 2020/1/15
 */
public class Solution4 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] chs1 = s.toCharArray();
        char[] chs2 = t.toCharArray();
        Arrays.sort(chs1);
        Arrays.sort(chs2);
        return Arrays.equals(chs1, chs2);
    }
}
