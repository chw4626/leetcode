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
public static int count = 0;
public static int number = 0;
    public int kthSmallest(TreeNode root, int k) {
        
        count = k;
        backtrack(root);
        return number;
        }
    public void backtrack(TreeNode n){
        if (n.left!= null)
        backtrack(n.left);
        
        count--;
        if (count == 0){
        number = n.val; 
        return;
        }
        if (n.right != null) backtrack(n.right);        
    }
}