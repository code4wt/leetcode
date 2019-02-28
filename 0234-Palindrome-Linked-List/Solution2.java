/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:25:33
 */
public class Solution2 {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        DoublyListNode newHead = new DoublyListNode(head.val);
        DoublyListNode tail = newHead;
        head = head.next;
        while (head != null) {
            DoublyListNode node = new DoublyListNode(head.val);
            node.prev = tail;
            tail.next = node;
            tail = node;
            head = head.next;
        }

        while (newHead != tail && newHead.next != tail) {
            if (newHead.val != tail.val) {
                return false;
            }
            newHead = (DoublyListNode) newHead.next;
            newHead.prev = null;
            tail = (DoublyListNode) tail.prev;
            tail.next = null;
        }

        return newHead.val == tail.val;
    }
}
