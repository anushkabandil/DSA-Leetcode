class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] wordArray = s.split("\\s+");
        int left=0; 
        int right = wordArray.length-1;
        while(left < right){
            String temp = wordArray[left];
            wordArray[left] = wordArray[right];
            wordArray[right] = temp;
            left++;
            right--;
        }
         return String.join(" ", wordArray);
    }
}