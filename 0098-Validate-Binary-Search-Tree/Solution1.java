import java.util.Stack;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-28 16:51:09
 */
public class Solution1 {

    private Stack<Integer> stack = new Stack<>();

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!isValidBST(root.left) || (!stack.isEmpty() && stack.peek() >= root.val)) {
            return false;
        }
        stack.push(root.val);

        return isValidBST(root.right);
    }
}
