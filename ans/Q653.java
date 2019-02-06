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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root,set,k);
    }
    public boolean helper(TreeNode root, HashSet<Integer> set, int k){
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return helper(root.left,set,k) || helper(root.right,set,k);
    }
}