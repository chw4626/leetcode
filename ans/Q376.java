class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <1 ) return 0;
        int len = 1;
        int[] tep = new int[nums.length-1];
        for(int i = 1; i < nums.length; i++){
            tep[i-1] = nums[i] - nums[i-1];
        }
        int index = 0;
        while(index < tep.length && tep[index]==0){
            index++;
        }
        if(index < tep.length){
            boolean flag = tep[index]>0 ? true : false;
            len++;
            for(int i = index; i <tep.length;i++){
                if(flag&&tep[i]<0){
                    len++;
                    flag = false;
                }
                if((!flag)&&tep[i]>0){
                    len++;
                    flag = true;
                }
                continue;
            }
        }
        return len;
    }
}