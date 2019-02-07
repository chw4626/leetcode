class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        helper(new LinkedList<Integer>(), 0, nums, res);
        return res;
    }
    public void helper(LinkedList<Integer> temp, int start, int[] nums, List<List<Integer>> res){
        if(temp.size() > 1) res.add(new LinkedList<Integer>(temp));
        Set<Integer> used = new HashSet<>();
        for(int i = start; i < nums.length; i++){
            if(!used.add(nums[i])) continue;
            if(temp.size() == 0 || nums[i] >= temp.get(temp.size()-1)){
                used.add(nums[i]);
                temp.add(nums[i]);
                helper(temp,i+1,nums,res);
                temp.remove(temp.size()-1);
            }
        }
    }
}