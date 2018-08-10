/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null) {
            return head;
        }
        //find length
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        //determine how many nodes to rotate
        int num = k % len;
        if (num == 0) {
            return head;
        }
        
        //rotate
        ListNode start = head, end = head;
        for (int i = 0; i < num; i++) {
            end = end.next;
        }
        
        while (end.next != null) {
            start = start.next;
            end = end.next;
        }
        
        ListNode newHead = start.next;
        start.next = null;
        end.next = head;
        
        return newHead;
}
}