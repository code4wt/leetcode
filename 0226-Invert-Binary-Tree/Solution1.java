/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-14 13:12:55
 */
public class Solution1 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode right = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(right);
        return root;
    }
}
