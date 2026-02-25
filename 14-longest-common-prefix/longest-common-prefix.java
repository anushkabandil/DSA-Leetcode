class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        if (strs == null || strs.length == 0) return "";
        for(int i=0; i< Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            else ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}