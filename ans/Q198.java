class Solution {
    public int rob(int[] num) {        
    int rob = 0;
    int notrob = 0;
    for (int n = 0; n < num.length; n++){
        int currob = notrob+ num[n];
        notrob = Math.max(rob,notrob);
        rob = currob;
    }
        return Math.max(rob,notrob);
}
    
}