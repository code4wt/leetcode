/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-02-26 21:02:56
 */
public class Solution {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;
        s = s.toLowerCase();
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) start++;
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) end--;
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }

        return true;
    }
}
