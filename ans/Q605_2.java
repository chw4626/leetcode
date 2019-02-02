class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed==null || flowerbed.length==0) return n<=0;
        if(flowerbed.length==1) return flowerbed[0]==0? n<=1 : n<=0;
        int res = 0;
        for(int i=0; i<flowerbed.length; ){
            int j = i;
            while(j<flowerbed.length && flowerbed[j]==0){
                j++;
            }
            if(i==0 && j==flowerbed.length) res += (flowerbed.length-1)/2 +1;
            else if (i==0 || j==flowerbed.length) res += (j-i)/2;
            else res += (j-i-1)/2;
            i=j+1;
        }
        return n<=res;        
    }
}