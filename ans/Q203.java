/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode p = res;
        ListNode q = head;
        while(q!=null){
            if(q.val == val){
                p.next = q.next;
            }
            else{
                p = p.next;
            }
            q = q.next;         
        }
        return res.next;
    }
}