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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return res;

        help(root);
        return res;
    }
    public int help(TreeNode root){
        int count = 0;
        if(root == null)
            return 0;
        
        else{
            int left = help(root.left);
            int right = help(root.right);
            res = Math.max(res, left + right);
            count = Math.max(left,right)+1;
        }
        return count;
    }
}