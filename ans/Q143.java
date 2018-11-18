/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode md = slow;
        ListNode pre = slow.next;
        while(pre.next!= null){
            ListNode curr = pre.next;
            pre.next = curr.next;
            curr.next = md.next;
            md.next = curr;
        }
        ListNode p1 = head;
        ListNode p2 = md.next;
        while(p1!=md){
            md.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = md.next;
            
        }
    }
}
