import java.util.ArrayList;
import java.util.List;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-01 12:03:22
 */
public class Solution2 {

    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        return p.val == q.val && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
