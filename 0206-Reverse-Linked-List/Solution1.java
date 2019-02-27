/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:23:06
 */
public class Solution1 {

     public ListNode reverseList(ListNode head) {
         if (head == null) {
             return null;
         }
         ListNode p1 = head, p2 = head.next, p3 = null;
         if (p2 == null) {
             return head;
         }

         p1.next = null;
         while (p2 != null) {
             p3 = p2.next;
             p2.next = p1;
             p1 = p2;

             if (p3 == null) {
                 return p2;
             }

             p2 = p3;
         }

         return null;
     }
 }
}
