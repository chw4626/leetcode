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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node = creat(nums,0,nums.length-1);
            return node;
    }
    public TreeNode creat(int[] nums,int left,int right){
        if (left > right)
            return null;
        int mid  = (left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = creat(nums, left , mid -1);
        node.right = creat(nums, mid+1 , right);
        return node;
    }
}