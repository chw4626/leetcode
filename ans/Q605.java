class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length < 1) return n <=0;
        int count = 0;
        
        int num = 0;
        List<Integer> list = new ArrayList<>();
        if(flowerbed[0] == 0)
            list.add(0);
        for(int f : flowerbed){
            list.add(f);
        }
        if(flowerbed[flowerbed.length-1] == 0)
            list.add(0);
        int pre = -1;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 0){
                count ++;                
            }
            else{
                num += (count-1)/2;
                count = 0;
            }
        }
        num += (count-1)/2;
        return n <= num;
        
    }
}