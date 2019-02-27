/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:25:33
 */
public class Solution2 {

    public ListNode reverseList(ListNode head) {
        ListNode newNode  = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }

        return newNode;
    }
}
