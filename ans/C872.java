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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1 = new ArrayList<Integer>();
        ArrayList<Integer> r2 = new ArrayList<Integer>();
        helper(root1, r1);
        helper(root2, r2);
        return r1.equals(r2);
    }
    public void helper(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null)
            list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}