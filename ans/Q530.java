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
    int min = Integer.MAX_VALUE;
    Integer pre = null;
    public int getMinimumDifference(TreeNode root) {
        if (root == null)
            return min;
        
        getMinimumDifference(root.left);
        if(pre != null){
            min = Math.min(min,root.val-pre);
        }
        pre = root.val;
        getMinimumDifference(root.right);
        return min;
    }
}