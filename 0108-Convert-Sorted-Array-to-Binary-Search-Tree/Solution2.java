import java.util.Stack;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-06 12:34:03
 */
public class Solution2 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        TreeNode root = new TreeNode(0);
        Stack stack = new Stack();
        stack.push(0);
        stack.push(nums.length - 1);
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = (TreeNode) stack.pop();
            int hi = (int) stack.pop();
            int lo = (int) stack.pop();
            int mid = lo + ((hi - lo) >> 1);
            node.val = nums[mid];
            if (lo <= mid - 1) {
                node.left = new TreeNode(0);
                stack.push(lo);
                stack.push(mid - 1);
                stack.push(node.left);
            }
            if (hi >= mid + 1) {
                node.right = new TreeNode(0);
                stack.push(mid + 1);
                stack.push(hi);
                stack.push(node.right);
            }
        }

        return root;
    }
}
