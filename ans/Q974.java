class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int[] count = new int[K];
        count[0] = 1;
        int res = 0, prefix =0;
        for(int a : A){
            prefix = (prefix + K + a % K) % K;
            res += count[prefix];
            count[prefix]++;
        }
        return res;
    }
}