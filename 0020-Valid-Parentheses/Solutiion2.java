import java.util.Stack;

/**
 * Solutiion1
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 18:06:58
 */
public class Solutiion2 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || ch != stack.pop()) return false;
            }
        }

        return stack.isEmpty();
    }
}
