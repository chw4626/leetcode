/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return tobst(head,null);
    }
    public TreeNode tobst(ListNode head, ListNode tail){
        ListNode fast = head;
        ListNode slow = head;
        if(head == tail) return null;
        while(fast!= tail&&fast.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
            
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = tobst(head,slow);
        root.right = tobst(slow.next,tail);
        return root;
    }
}