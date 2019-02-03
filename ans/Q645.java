class Solution {
    public int[] findErrorNums(int[] nums) {
        if(nums.length < 1) return null;
        Set<Integer> set = new HashSet<>();
        int sum1 = 0;
        int sum2 = 0;
        int du = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(set.contains(nums[i]))
                du = nums[i];
            else{
                sum1 += nums[i];
                
                set.add(nums[i]);
            }
            sum2 += i+1;
        }
        return new int[] {du, sum2 - sum1};
    }
}