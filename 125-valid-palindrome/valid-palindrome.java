class Solution {
    public boolean isPalindrome(String s) {
          String s1 = s.toLowerCase().replaceAll("[^a-z0-9]","");
          String reversed = new StringBuilder(s1).reverse().toString();
        
          return s1.equals(reversed);
    }
}