/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 17:51:55
 */
public class Solution1 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String str = strs[0];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i) {
                    return strs[j];
                }
                if (strs[j].charAt(i) != str.charAt(i)) {
                    return i == 0 ? "" : str.substring(0, i);
                }
            }
        }

        return str;
    }
}
