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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new LinkedList<TreeNode>();
            else
        return generateSubtree(1,n);
    }
    public List<TreeNode> generateSubtree(int s, int e){
        List<TreeNode> res = new LinkedList<TreeNode>();
        if(s>e){
            res.add(null);
            return res;
        }
        for(int i = s; i<= e; i++){
            List<TreeNode> leftn = generateSubtree(s,i-1);
            List<TreeNode> rightn = generateSubtree(i+1,e);
            
            for(TreeNode left: leftn){
                for(TreeNode right: rightn){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}