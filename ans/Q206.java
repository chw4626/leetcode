/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode reverseList(ListNode head) 
	{
		ListNode preHead = head;
		ListNode CurNode = null;
		for (int i = 0; head!=null; i++)
		{
			preHead = head.next;
			head.next = CurNode;
			CurNode = head;
			head = preHead;
		}
		return CurNode;
    }
}