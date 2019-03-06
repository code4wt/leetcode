/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-06 12:34:03
 */
public class Solution1 {

     public TreeNode sortedArrayToBST(int[] nums) {
         if (nums == null || nums.length == 0) return null;
         return convert(nums, 0, nums.length - 1);
     }

     private TreeNode convert(int[] nums, int lo, int hi) {
         if (lo > hi) return null;
         int mid = lo + (hi - lo) / 2;
         TreeNode node = new TreeNode(nums[mid]);
         node.left = convert(nums, lo, mid - 1);
         node.right = convert(nums, mid + 1, hi);
         return node;
     }
}
