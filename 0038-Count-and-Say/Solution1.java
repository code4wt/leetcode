/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 12:09:51
 */
public class Solution1 {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);

        StringBuilder sb = new StringBuilder();
        char cur = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != cur) {
                sb.append(count).append(cur);
                count = 1;
                cur = str.charAt(i);
                continue;
            }

            count++;
        }

        return sb.append(count).append(cur).toString();
    }
}
