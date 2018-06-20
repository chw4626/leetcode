class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int res = 0;
        boolean[] nl = new boolean[n-1];
        
        for (int i = 0; i < n; i++){
            if(nl[nums[i]-1] == false){
                nl[nums[i]-1] = true;
            }
                
            else{
                res = nums[i];
                break;
            }
        }
         return res;
    }
}