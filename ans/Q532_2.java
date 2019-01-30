class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length == 0 || k < 0) return 0;
        
        Arrays.sort(nums);
        int left = 0, count = 0, right = 1;
        while(right < nums.length){
            int diff = nums[right] - nums[left];
            if(diff < k || left == right)
                right++;
            else if(diff > k)
                left++;
            else{
                count++;
                int x = nums[right];
                while(right < nums.length && x == nums[right])
                    right++;
            }
        }
        return count;
    }
}