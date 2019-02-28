/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-28 16:32:29
 */
public class Solution1 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return (lh < rh ? rh : lh) + 1;
    }
}
