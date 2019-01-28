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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new LinkedList<>();
        post(root,new HashMap<>(),res);
        return res;
    }
    public String post(TreeNode root, Map<String, Integer> map, List<TreeNode> res){
        if(root == null) return "";
        String serial = root.val + "," + post(root.left,map,res) + "," + post(root.right,map,res);
        if(map.getOrDefault(serial,0) == 1) res.add(root);
        map.put(serial,map.getOrDefault(serial,0) + 1);
        return serial;
    }
}