class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
            return res;
        }
        int rs = 0;
        int re = matrix.length-1;
        int cs = 0;
        int ce = matrix[0].length-1;
        while(rs <= re &&cs <=ce ){
            for(int i = cs; i <=ce;i++ ){
                res.add(matrix[rs][i]);
            }
            rs++;
            for(int i = rs; i<=re; i++){
                res.add(matrix[i][ce]);
            }
            ce--;
            if(rs <= re){
            for(int i = ce; i>=cs; i--){
                res.add(matrix[re][i]);
            }
            re--;
            }
            if(cs<=ce){
            for(int i = re; i>=rs; i--){
                res.add(matrix[i][cs]);
            }
            cs++;
            }
        }
        return res;
    }
}