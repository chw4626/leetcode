class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for (int i = start; i < nums.length; i++){
        if(i>start&&nums[i-1]==nums[i]){
            continue;
        }
        tempList.add(nums[i]);
        backtrack(list,tempList,nums,i+1);
        
        tempList.remove(tempList.size()-1);
    }
}

}
for{
    [0]
    back{
        [01]
        back{
            [012]
            back{}
            remove2 --[01]
        }
        remove 1 -- [0]
        [02]{}
    }
    remove 0 -- []
    [1]{}
    [2]{}
}