/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:25:33
 */
public class Solution2 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
