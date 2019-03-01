import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-28 23:20:38
 */
public class Solution2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        traverse(root, list, 0);
        return list;
    }

    private void traverse(TreeNode root, List<List<Integer>> list, int height) {
        if (root == null) {
            return;
        }

        if (height == list.size()) {
            list.add(new ArrayList<>());
        }

        list.get(height).add(root.val);
        traverse(root.left, list, height + 1);
        traverse(root.right, list, height + 1);
    }
}
