class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int max = 0;
        for(int i = 1; i < prices.length; i++){
            max = Math.max(0,max+=prices[i] - prices[i-1]);
            res = Math.max(res,max);
        }
        return res;
    }
}
