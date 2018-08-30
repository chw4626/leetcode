class Solution {
    public String getPermutation(int n, int k) {
        if (1 == n) return "1";
        
        StringBuilder base = new StringBuilder();
        int width = 1;
        for (int i = 1; i <= n; ++i) {
            base.append(i);
            width *= i;
        }
        
        return getPermutation(base, width/n, n - 1, k - 1);
    }
    
    
    private String getPermutation(StringBuilder base, int width, int n, int k) {
        if (n == 0) return base.toString();
        
        char prefix = base.charAt(k / width);

        base.deleteCharAt(k / width);
        return "" + prefix + getPermutation(base, width / n, n - 1, k % width);
    }
}