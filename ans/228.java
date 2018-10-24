class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length < 1) return new ArrayList<String>();
        int left = nums[0];
        int right = nums[0];
        List<String> res = new ArrayList<String>();
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == right+1){
                right = nums[i];
            }
            else if(left == right){
                res.add(String.valueOf(left));
                left = nums[i];
                right = nums[i];
            }
            else{
                String s = String.valueOf(left) + "->" + String.valueOf(right);
                res.add(s);
                left = nums[i];
                right = nums[i];
            }
        }
        if(left == right){
                res.add(String.valueOf(left));
            }
        else{
            String s = String.valueOf(left) + "->" + String.valueOf(right);
                res.add(s);
        }
        return res;
    }
}