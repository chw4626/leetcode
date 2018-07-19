public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = 1;
        int[] lens = new int[nums.length];
        Arrays.fill(lens, 1);
        for(int i=1; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if (nums[j]<nums[i]) lens[i] = Math.max(lens[i], lens[j]+1);
            }
            max = Math.max(max, lens[i]);
        }
        return max;
    }
}
