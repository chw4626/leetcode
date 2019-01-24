class Solution {
    public int arrangeCoins(int n) {
        int d = 1;
        while(n - d >= 0){
            n -= d;
            d++;
        }
        return d -1;
    }
}