class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        int res = 0;
        int l = height.length;
        int lm[] = new int[l];
        int rm[] = new int[l];
        lm[0] = height[0];
        for(int i = 1; i < l;i++){
            lm[i] = Math.max(height[i],lm[i-1]);
        }
        rm[l-1] = height[l-1];
        for(int i = l-2; i >= 0;i--){
            rm[i] = Math.max(height[i],rm[i+1]);
        }
        for(int i = 1; i < l -1; i++){
            res += Math.min(lm[i],rm[i]) - height[i];
        }
        return res;
    }
}