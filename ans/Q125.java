class Solution {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}