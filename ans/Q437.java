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
    
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return helper(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }
    public int helper(TreeNode root, int sum){
        int count = 0;
        if(root == null) return count;
        if(sum == root.val)
            count++;
        count += helper(root.left, sum - root.val);
        count += helper(root.right, sum - root.val);
        return count;
    }
}