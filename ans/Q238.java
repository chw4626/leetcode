class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 0; i< n-1; i++){
            res[i+1] = res[i] * nums[i];
        }
        int right = 1;
        for (int i = n - 1; i>= 0;i--){
            
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}