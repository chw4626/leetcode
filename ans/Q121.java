class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 1; i< prices.length;i++ ){
            prices[i] = Math.max(prices[i],(prices[i]-prices[i-1]));
            if (prices[i]>max){
                max = prices[i];
            }
        }
        return max;
    }
}
