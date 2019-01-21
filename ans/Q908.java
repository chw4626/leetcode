class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        for(int a : A){
            min = Math.min(min,a);
            max = Math.max(max,a);
        }
        return (max - K - min - K) > 0 ? (max - K - min - K) : 0;
    }
}