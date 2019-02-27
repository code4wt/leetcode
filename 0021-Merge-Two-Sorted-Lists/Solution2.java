/**
 * Solution2
 *
 * @author Tian ZhongBo
 * @date 2019-02-27 20:25:33
 */
public class Solution2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
