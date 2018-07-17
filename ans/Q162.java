class Solution {
    public int findPeakElement(int[] nums) {
        int peak = nums[0];
        for(int i = 1; i< nums.length;i++){
            if(peak<nums[i]){
                peak = nums[i];
            }
            else
                return i-1;
        }
        return nums.length -1;
    }
}