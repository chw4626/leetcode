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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(root,sum,res,temp);
        return res;
    }
    public void dfs(TreeNode root, int sum, List<List<Integer>> res, List<Integer> temp){
        if (root == null) return;
        
        temp.add(root.val);
        
        if(sum == root.val && root.left == null && root.right == null){
            res.add(new ArrayList<Integer>(temp));
            
        }
        else{
            sum = sum - root.val;
            dfs(root.left, sum, res, temp);
            dfs(root.right, sum, res, temp);
        }
        temp.remove(temp.size()-1);
    }
}