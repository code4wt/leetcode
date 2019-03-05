/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-05 08:34:47
 */
public class Solution1 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode p1 = new ListNode(0), p2 = head;
        p1.next = p2;
        head = p1;
        while (p2 != null) {
            if (p2.val == val) {
                p1.next = p2.next;
                p2.next = null;
                p2 = p1.next;
                continue;
            }

            p2 = p2.next;
            p1 = p1.next;
        }

        return head.next;
    }
}
