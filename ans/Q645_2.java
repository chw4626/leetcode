class Solution {
    public int[] findErrorNums(int[] nums) {
        if(nums.length < 1) return null;
        int[] count = new int[nums.length];
        int dup = 0;
        for(int n : nums){
            count[n-1]++;
            if(count[n-1] == 2){
                dup = n;
            }
        }
        int mis = 0;
        for(int i =0; i < nums.length; i++){
            if(count[i] == 0){
                mis = i + 1;
                break;
            }
        }
        return new int[]{dup,mis};
    }
}