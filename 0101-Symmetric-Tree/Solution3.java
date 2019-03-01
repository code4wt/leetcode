import java.util.Stack;

/**
 * Solution3
 *
 * @author Tian ZhongBo
 * @date 2019-03-01 12:08:31
 */
public class Solution3 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> s = new Stack<>();
        s.push(root.left);
        s.push(root.right);

        while (!s.isEmpty()) {
            TreeNode p = s.pop();
            TreeNode q = s.pop();

            if (p == null && q == null) continue;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;

            s.push(p.left);
            s.push(q.right);
            s.push(p.right);
            s.push(q.left);
        }

        return true;
    }
}
