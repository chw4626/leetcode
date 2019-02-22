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
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null)
        return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        flatten(right);
        flatten(left);
        root.right = left;
        TreeNode curr = root;
        while(curr.right != null)
            curr = curr.right;
        curr.right = right;
        //left.right = right;
        //left.left = null;
        //root.right = left;
        //root.left = null;
    }
}