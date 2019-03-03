import java.util.Stack;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-02 22:04:38
 */
public class MinStack {

    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        int min = minStack.isEmpty() || x < minStack.peek() ? x : minStack.peek();
        minStack.push(min);
    }

    public void pop() {
        if (dataStack.isEmpty()) return;
        dataStack.pop();
        minStack.pop();
    }

    public Integer top() {
        return dataStack.isEmpty() ? null : dataStack.peek();
    }

    public Integer getMin() {
        return minStack.isEmpty() ? null : minStack.peek();
    }
}
