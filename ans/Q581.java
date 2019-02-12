class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] dup = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            dup[i] = nums[i];
        }
        Arrays.sort(dup);
        int left = -1;
        int right = -1;
        for(int i = 0; i < nums.length; i++){
            if(dup[i] != nums[i]){
                if(left < 0)
                    left = i;
                else
                    right = i;
            }
        }
        return right - left  == 0 ? 0 : right - left + 1;
        
    }
}