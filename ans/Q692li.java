public class Solution {
    /**
     * @param nums: the given array
     * @param k: the window size
     * @return: the sum of the count of unique elements in each window
     */
    public int slidingWindowUniqueElementsSum(int[] nums, int k) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int count = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == 1) count++;
            if(map.get(nums[i]) == 2) count--;
        
            if(i>=k){
                map.put(nums[i-k], map.get(nums[i-k])-1);
                if(map.get(nums[i-k]) == 0) count--;
                if(map.get(nums[i-k]) == 1) count++;
            }
            if(i>= k-1) sum += count;
        }
        return k > nums.length ? count:sum;
    }
}