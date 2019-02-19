class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<Integer>();
        int first = 0, last = arr.length-1;
        while(last - first + 1 > k){
            if(Math.abs(arr[first]-x) > Math.abs(arr[last]-x))
                first++;
            else
                last--;
        }
        for(int i = first; i <= last; i++){
            res.add(arr[i]);
        }
        return res;
    }
}