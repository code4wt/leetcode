/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:23:06
 */
public class Solution1 {

    public void deleteNode(ListNode node) {
        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
                return;
            }

            node = node.next;
        }
    }
}
