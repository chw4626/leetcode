class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for(int num : nums)
            diff ^= num;
        diff &= -diff;
        
        int[] set = {0,0};
        for(int num: nums){
            if((num & diff) == diff)
                set[0] ^= num;
        else 
            set[1] ^= num;
                
        }
        return set;
    }
}