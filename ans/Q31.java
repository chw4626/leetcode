class Solution {
    public void nextPermutation(int[] nums) {
        if(nums ==null|| nums.length ==0) return;
        int firsts = -1;
        for(int i = nums.length-2; i>= 0; i--){
            if(nums[i] < nums[i+1])
                firsts = i;break;
        }
        if(firsts == -1){
            reverse(nums,0);
            return;
        }
        int firstl = -1;
        for(int i = nums.length-1; i >firsts; i--){
            if(nums[i]>nums[firsts])
                 firstl = i; break;
        }
        swap(nums,firsts,firstl);
        reverse(nums, firsts + 1);
    }
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i++] = nums[j];
        nums[j--] = temp;
    }
}