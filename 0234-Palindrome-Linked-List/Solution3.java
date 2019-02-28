/**
 * Solution3
 *
 * @author Tian ZhongBo
 * @date 2019-02-28 11:26:07
 */
public class Solution3 {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode p1 = head, p2 = head, p3 = p1.next, pre = head;
        while (p2.next != null && p2.next.next != null) {
            p2 = p2.next.next;
            pre = p1;
            p1 = p3;
            p3 = p3.next;
            p1.next = pre;
        }

        if (p2.next == null) {
            p1 = p1.next;
        }

        while (p3 != null) {
            if (p1.val != p3.val) {
                return false;
            }

            p3 = p3.next;
            p1 = p1.next;
        }

        return true;
    }
}
