class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0)
            return -1;
        int[] sum = new int[nums.length];
        int suml = 0;
        sum[nums.length-1] = 0;
        for(int i = nums.length -2; i >= 0; i--){
            suml += nums[i+1];
            sum[i] = suml;            
        }
        
        int sumr = 0;
        for(int i = 0; i < nums.length; i++){
            //System.out.println(sumr);
            if(sum[i] == sumr)
                return i;
            sumr += nums[i];
        }
        return -1;
    }
}