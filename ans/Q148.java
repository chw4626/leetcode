/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null|| head.next == null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null&&fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow.next;
        slow.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(middle);
        return mergeList(l1,l2);
    }
    public ListNode mergeList(ListNode l1, ListNode l2){
        ListNode l = new ListNode(0);
        ListNode p = l;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l.next = l1;
                l1 = l1.next;
            }
            else{
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }
        if(l1 != null)
            l.next = l1;
        if(l2 != null)
            l.next = l2;
        return p.next;        
    }
}