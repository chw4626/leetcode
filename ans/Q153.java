class Solution {
    public int findMin(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            int j = i+1;
            if(nums[j]<nums[i])
                return nums[j];
        }
        return nums[0];
    }
}