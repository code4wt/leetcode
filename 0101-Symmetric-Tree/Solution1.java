import java.util.ArrayList;
import java.util.List;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-01 12:03:22
 */
public class Solution1 {

     public boolean isSymmetric(TreeNode root) {
         List<List<Integer>> wrapList = new ArrayList<>();
         traverse(root, wrapList, 0);

         for (List<Integer> subList : wrapList) {
             for (int i = 0, j = subList.size() - 1; i < j; i++, j--) {
                 if (subList.get(i).equals(subList.get(j))) {
                     return false;
                 }
             }
         }

         return true;
     }

     private void traverse(TreeNode root, List<List<Integer>> list, int height) {
         if (height == list.size()) {
             list.add(new ArrayList<>());
         }
         list.get(height).add(root == null ? null : root.val);

         if (root != null) {
             traverse(root.left, list, height + 1);
             traverse(root.right, list, height + 1);
         }

     }
}
