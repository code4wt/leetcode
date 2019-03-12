/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 11:44:27
 */
public class Solution {

    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                ch += 32;
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
