/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-28 16:32:29
 */
public class Solution2 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
