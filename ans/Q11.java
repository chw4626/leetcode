class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int s = 0;
        int e = height.length-1;
        while(s<e){
            max = Math.max(max,(e-s)*Math.min(height[s],height[e]));
            if(height[s]<height[e]){
                s = s+1;
            }
            else
                e = e-1;
        }
        return max;
    }
}