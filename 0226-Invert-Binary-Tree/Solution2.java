import java.util.Stack;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-14 13:12:55
 */
public class Solution2 {

    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) continue;
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return root;
    }
}
