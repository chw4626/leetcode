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
    public boolean isSymmetric(TreeNode root) {
        return ismiror(root,root);
    }
    public boolean ismiror(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        if(left==null||right==null)
            return false;
        else 
            return (left.val==right.val)&&ismiror(left.left,right.right)&&ismiror(left.right,right.left);
        
    }
}