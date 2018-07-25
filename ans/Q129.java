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
    public int sumNumbers(TreeNode root) {
        int res = 0;
        return sum(root,res);
        
    }
    public int sum(TreeNode root, int s){
        if(root == null)
            return 0;
        if(root.left == null&&root.right== null)
            return s*10 + root.val;
        else{
            s = s* 10 + root.val;
            return sum(root.left,s)+sum(root.right,s);
        }
    }
}