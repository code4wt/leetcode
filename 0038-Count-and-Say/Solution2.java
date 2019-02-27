/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 12:23:12
 */
public class Solution2 {

    public String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            char cur = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) != cur) {
                    sb.append(count).append(cur);
                    count = 1;
                    cur = str.charAt(j);
                    continue;
                }

                count++;
            }

            str = sb.append(count).append(cur).toString();
        }

        return str;
    }
}
