/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        /*if(head == null) return null;
        ListNode curr = new ListNode(0);
        ListNode res = curr;
        curr.next = head;
        while(curr.next!= null){
            if(curr.next.val==curr.next.next.val){
            while(curr.next.val==curr.next.next.val)
                curr.next = curr.next.next;
            curr.next = curr.next.next;    
            }
            else
            curr = curr.next;
        }
        if(curr == null)
            return null;
        else
        return res.next;*/
        if(head==null) return null;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    }
}