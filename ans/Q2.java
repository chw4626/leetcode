/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res,dumb = new ListNode(0);
        int i = 0;
        res = dumb;
        while(l1!=null||l2!=null||i!=0){
            if(l1!=null){
                i += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                i += l2.val;
                l2 = l2.next;
            }
            dumb.next = new ListNode(i%10);
            i = i/10;
            dumb = dumb.next;    
        }
        return res.next;
    }
}