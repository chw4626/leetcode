class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i = 0, j = nums.length-1;
        while(i < j){
            sum += nums[j] - nums[i];
            j--;
            i++;
        }
        return sum;
    }
}