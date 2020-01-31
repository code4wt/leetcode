import java.util.Arrays;

/**
 * @author tianxiaobo
 * @date 2020/1/17
 */
public class Solution3 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String first = strs[0], last = strs[strs.length - 1];
        int end = Math.min(first.length(), last.length());
        int i = 0;
        while (i < end && first.charAt(i) == last.charAt(i)) i++;
        return first.substring(0, i);
    }
}
