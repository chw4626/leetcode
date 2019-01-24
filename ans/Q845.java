class Solution {
    public int longestMountain(int[] A) {
        int n=A.length;
        if(n<3)return 0;
        
        int left=0;int right;int max=0;
        while(left + 2 < n){
            while(left + 1 < n && A[left] >= A[left + 1])
                left++;
            right = left + 1;
            while(right + 1 < n && A[right] < A[right + 1])
                right++;
            while(right + 1 < n && A[right] > A[right + 1]){
                right++;
                max = Math.max(max,right - left + 1);
            }
                
            left = right;
        }
        return max;
    }
}