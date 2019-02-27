/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:25:33
 */
public class Solution2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode phantom = new ListNode(0);
        phantom.next = head;
        ListNode slow = phantom, fast = phantom;
        while (fast.next != null) {
            if (n-- <= 0) {
                slow = slow.next;
            }

            fast = fast.next;
        }

        if (slow.next != null) {
            slow.next = slow.next.next;
        }

        return phantom.next;
    }
}
