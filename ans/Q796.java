class Solution {
    public boolean rotateString(String A, String B) {
        int a = A.length(), b = B.length();
        if(a != b) return false;
        if(a == 0) return true;
        for(int i = 0; i < a; i++){
            if(A.equals(B))
                return true;
            A += A.charAt(0);
            A = A.substring(1);
        }
        return false;
    }
}