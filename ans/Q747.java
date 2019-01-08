class Solution {
    public int dominantIndex(int[] nums) {
        int index = 0;
        if(nums.length==1)
            return 0;
        int max = nums[0];
        int smax;
        if(nums[1]>max){
            smax = max;
            max = nums[1];
            index = 1;
        }
        else
            smax = nums[1];
        for(int i = 2; i<nums.length;i++){
            if(nums[i]>max){
                smax = max;
                max = nums[i];
                index = i;
            }
            else if(nums[i]>smax){
                smax = nums[i];
            }
        }
        return max/2 >= smax ? index:-1;
    }
}