/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-02-26 20:20:44
 */
public class Solution2 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            int count = counts[s.charAt(i) - 'a']--;
            if (count <= 0) {
                return false;
            }
        }

        return true;
    }
}
