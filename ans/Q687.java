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
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        help(root,-1);
        return res;
    }
    public int help(TreeNode root, int val){
        if(root == null) return 0;
        int left = help(root.left, root.val);
        int right = help(root.right, root.val);
        int single = 0;
        
        res = Math.max(res, left+right);
        if(root.val == val)
            single = Math.max(left,right)+1;
        return single;
    }
}