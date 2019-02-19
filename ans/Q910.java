class Solution {
    public int smallestRangeII(int[] A, int K) {
        int n = A.length;
        Arrays.sort(A);
        int ans = A[n-1] - A[0];
        int max = A[n-1];
        int min = A[0];
        for(int i = 0; i < A.length - 1; i++){
            max = Math.max(max,A[i] + 2*K);
            min = Math.min(A[0] + 2*K, A[i+1]);
            ans = Math.min(ans,max - min);
        }
        return ans;
    }
}