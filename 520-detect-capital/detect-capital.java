class Solution {
    public boolean detectCapitalUse(String word) {
      if(word.length() <=1) return true;
      boolean secondIsUpper = Character.isUpperCase(word.charAt(1));

         for(int i=2; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)) != secondIsUpper){
                return false;
            }
         }
         if(secondIsUpper){
                return Character.isUpperCase(word.charAt(0));
         }
         return true;
    }
}