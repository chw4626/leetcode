class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        backtrack(res,candidates,target,0,temp);
        return res;
    }
    public static void backtrack(List<List<Integer>> res,int[] cand,int target,int cur, List<Integer> temp){
        if(target==0){
            res.add(new ArrayList(temp));
                return;
        }
        if(target<0) return;
        for(int i = cur; i < cand.length; i++){
            if(i > cur&& cand[i]==cand[i-1]) continue;
            temp.add(cand[i]);
            backtrack(res,cand,target-cand[i],i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}