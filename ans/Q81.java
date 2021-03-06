class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(target==nums[mid])
                return true;
            if (nums[left] < nums[mid]|| nums[right] < nums[mid]){
                 if (target < nums[mid] && target >= nums[left]) 
                    right = mid - 1;
                 else
                    left = mid + 1;
            } 
        
            else if (nums[mid] < nums[right]|| nums[mid]<nums[left]){
                if (target > nums[mid] && target <= nums[right])
                    left = mid + 1;
                 else
                    right = mid - 1;
            }
            else left++;
        }
        return false;
    }
}