class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < nums.length; i ++){
            if(nums[i]==0){
                red++;
            }
            else if(nums[i]==1){
                white++;
            }
            else if(nums[i]==2){
                blue++;
            }
        }
        for (int i = 0; i < red; i ++){
            nums[i] = 0;
        }
        for (int i = red; i < white+red; i ++){
            nums[i] = 1;
        }
        for (int i = white+red; i < nums.length; i ++ ){
            nums[i] = 2;
        }
    }
}