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
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null) return new int[] {};
        HashMap<Integer,Integer> map = new HashMap<>();
        rootsum(root,map);
        int max = -1;
        for(int n : map.values()){
            if(n > max)
                max = n;
        }
        List<Integer> list = new ArrayList<>();
        for(int k :map.keySet()){
            if(map.get(k) == max)
                list.add(k);
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
        
    }
    public int rootsum(TreeNode root, HashMap<Integer,Integer> map){
        if(root == null) return 0;
        int sum = root.val + rootsum(root.left,map) + rootsum(root.right,map);
        map.put(sum, map.getOrDefault(sum,0) + 1);
        return sum;
    }
}