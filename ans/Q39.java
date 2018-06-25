class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List <List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(res,temp,candidates,target,0);
        return res;
    }
    public void backtrack(List <List<Integer>> res, List<Integer> temp, int[] n, int nums, int start){
        if(nums==0)
            res.add(new ArrayList<>(temp));
        else if(nums < 0)
            return;
        else
            for(int i = start; i < n.length;i++){
                temp.add(n[i]);
                backtrack(res,temp,n,nums-n[i],i);
                temp.remove(temp.size() - 1);
            }
    }
}