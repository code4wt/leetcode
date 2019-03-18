import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-18 13:23:06
 */
public class Solution2 {

    public String intToRoman(int num) {
        int a[] = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String s[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(num != 0 && i < a.length) {
            if(num - a[i] >= 0) {
                num -= a[i];
                sb.append(s[i]);
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
