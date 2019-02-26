/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-02-26 19:53:58
 */
public class Solution {

    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }

        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
        }
    }
}
