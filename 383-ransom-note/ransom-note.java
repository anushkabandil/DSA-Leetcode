class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frq = new int[26];
        for( char c:  magazine.toCharArray()){
            frq[c - 'a']++;
        }
        for( char c: ransomNote.toCharArray() ){
            if(frq[c - 'a'] == 0) return false;

            frq[c - 'a']--;
        }
        return true;
    }
}