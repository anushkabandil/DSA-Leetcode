class Solution {
    public String longestCommonPrefix(String[] strs) {

         if(strs == null || strs.length == 0){
            return "";
        } 
        
         Arrays.sort(strs);
        StringBuilder result = new StringBuilder();

        char [] first = strs[0].toCharArray();
        char [] last = strs[strs.length - 1].toCharArray();

        for(int i = 0 ; i < first.length; i++)
        {
            if( first[i] != last[i]) break;
            
             result.append(first[i]);
        }
    
    return result.toString();
    }
}