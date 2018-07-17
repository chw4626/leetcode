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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        rightview(root,res,0);
        return res;
    }
    public void rightview(TreeNode curr, List<Integer>res, int dep){
        if(curr==null){
            return;
        }
        if(dep == res.size()){
            res.add(curr.val);
        }
        rightview(curr.right,res,dep+1);
        rightview(curr.left,res,dep+1);
    }
}