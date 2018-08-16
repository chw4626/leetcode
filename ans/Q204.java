class Solution {
    public int countPrimes(int n) {
        boolean[] notb = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!notb[i]){
                count++;
                for(int j =2; i*j<n; j++){
                    notb[i*j] = true;
                }
            }
        }
        return count;
    }
}