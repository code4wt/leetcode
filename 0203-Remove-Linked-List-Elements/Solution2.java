/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-05 08:34:47
 */
public class Solution2 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
