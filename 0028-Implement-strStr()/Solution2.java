/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 19:08:35
 */
public class Solution2 {

    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) {
                    return i;
                }
                if (i + j >= haystack.length()) {
                    return -1;
                }

                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
        }
    }
}
