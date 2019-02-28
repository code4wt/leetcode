/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:23:06
 */
public class Solution1 {

    public boolean isPalindrome(ListNode head) {
        ListNode rhead = null, tmp = head;
        while (tmp != null) {
            ListNode node = new ListNode(tmp.val);
            node.next = rhead;
            rhead = node;
            tmp = tmp.next;
        }

        while (head != null) {
            if (head.val != rhead.val) {
                return false;
            }

            head = head.next;
            rhead = rhead.next;
        }

        return true;
    }
}
