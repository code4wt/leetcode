/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:23:06
 */
public class Solution1 {

    ListNode head = null, tail = null;

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        tail = head = l1.val < l2.val ? l1 : l2;
        while (l1 != null || l2 != null) {
            if (l1 == null || l2 == null) {
                tail.next = l1 == null ? l2 : l1;
                return head;
            } else if (l1.val < l2.val) {
                l1 = linkTail(l1);
            } else {
                l2 = linkTail(l2);
            }
        }

        return head;
    }

    private ListNode linkTail(ListNode l) {
        ListNode next = l.next;
        tail.next = l;
        tail = tail.next;
        return next;
    }
}
