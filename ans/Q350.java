class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pt1 = 0;
        int pt2 = 0;
        List<Integer> res = new ArrayList<Integer>();
        while(pt1 < nums1.length && pt2 < nums2.length){
            if(nums1[pt1] < nums2[pt2])
                pt1++;
            else if(nums1[pt1] > nums2[pt2])
                pt2++;
            else{
                res.add(nums1[pt1]);
                pt1++;
                pt2++;
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}