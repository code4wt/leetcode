import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-18 13:23:06
 */
public class Solution1 {

    private Map<Integer, String> map = new HashMap<>();

    public Solution1() {
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
    }

    public String intToRoman(int num) {
        if (num <= 0) return "";

        Stack<String> stack = new Stack<>();
        int i = 0;
        while (num > 0) {
            StringBuilder sb = new StringBuilder();
            int m = (int) Math.pow(10, i++);
            int d = num % 10;
            if (d < 4) {
                while (d > 0) {
                    sb.append(map.get(m));
                    d--;
                }
            } else if (d == 4) {
                sb.append(map.get(m)).append(map.get(5 * m));
            } else if (d > 5 && d < 9) {
                sb.append(map.get(5 * m));
                d -= 5;
                while (d > 0) {
                    sb.append(map.get(m));
                    d--;
                }
            } else if (d == 9) {
                sb.append(map.get(m)).append(map.get(10 * m));
            } else {
                sb.append(map.get(d * m));
            }

            stack.push(sb.toString());
            num /= 10;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());

        return sb.toString();
    }
}
