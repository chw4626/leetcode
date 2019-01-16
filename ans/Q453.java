class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n : nums){
            if(min > n)
                min = n;
        }
        int res = 0;
        for(int n : nums){
            res += n-min;
        }
        return res;
    }
}