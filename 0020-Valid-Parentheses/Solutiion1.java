import java.util.Stack;

/**
 * Solutiion1
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 18:06:58
 */
public class Solutiion1 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()
                    || ch == ')' && stack.pop() != '('
                    || ch == ']' && stack.pop() != '['
                    || ch == '}' && stack.pop() != '{') {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
