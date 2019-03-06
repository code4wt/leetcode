/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-06 13:37:50
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null) return head;
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;
        return sortList(head, tail);
    }

    private ListNode sortList(ListNode lo, ListNode hi) {
        if (lo == hi) {
            lo.next = null;
            return lo;
        }

        ListNode slow = new ListNode(0), fast = slow;
        slow.next = lo;
        while (fast != hi && fast.next != hi) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode next = slow.next;
        ListNode l1 = sortList(lo, slow);
        ListNode l2 = sortList(next, hi);
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == l2) return l1;

        ListNode head = new ListNode(0), tail = head, mid = l2;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tail.next = l2;
                return head.next;
            } else if (l2 == null) {
                tail.next = l1;
                return head.next;
            } else if (l1.val < l2.val) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }

        return head.next;
    }
}
