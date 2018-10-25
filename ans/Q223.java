class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int s1 = (D-B)*(C-A);
        int s2 = (H-F)*(G-E);
        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(F, B);
        int top = Math.min(D, H);
        //int s3 = 0;
        if(right > left && top > bottom){
            return s1+s2-(right - left) * (top - bottom);
        }
        return s1+s2;
    }
}