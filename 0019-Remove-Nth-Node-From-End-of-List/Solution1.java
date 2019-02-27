/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:23:06
 */
public class Solution1 {

     public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode p1 = head, p2 = head;
         while (n-- > 0) {
             p2 = p2.next;
         }

         while (p2 != null && p2.next != null) {
             p1 = p1.next;
             p2 = p2.next;
         }

         if (p1 == head && p2 == null) {
             head = p1.next;
             p1.next = null;
         } else {
             p1.next = p1.next.next;
         }

         return head;
     }
}
