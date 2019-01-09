class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        int s = (nums.length+1)/2; int t = nums.length;
        for(int i = 0; i < nums.length; i++){
            temp[i] = i%2 == 0 ? nums[--s] : nums[--t];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
    }
}