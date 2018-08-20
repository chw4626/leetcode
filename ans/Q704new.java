class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int mid;
        while(lo+1<hi){
            mid = lo + (hi - lo)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                hi = mid;
            else
                lo = mid;
        }
        if(nums[lo]==target)
            return lo;
        if(nums[hi]==target)
            return hi;
        return -1;
    }
}