class Solution {
    public int[] constructRectangle(int area) {
        long res = area;
        while(res*res > area){
            res = (res+ area/res)/2;
        }
        int r = Integer.parseInt(String.valueOf(res));
        while(area%r!=0){
            r--;
        }
        int[] re = {area/r, r};
        return re;
    }
}