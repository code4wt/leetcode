/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-16 20:48:18
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(0), tail = dummyHead;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            tail = tail.next;
        }

        if (carry > 0) tail.next = new ListNode(carry);
        return dummyHead.next;
    }
}
