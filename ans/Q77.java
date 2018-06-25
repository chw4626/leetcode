class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List <List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(res,temp,n,k,0);
        return res;
    }
    public void backtrack(List <List<Integer>> res,List<Integer> temp,int max,int num,int start){
        if(num == 0)
            res.add(new ArrayList<>(temp));
        else
            for(int i = start; i <max; i++){
                temp.add(i+1);
                backtrack(res,temp,max,num-1,i+1);
                temp.remove(temp.size()-1);
            }
    }
}