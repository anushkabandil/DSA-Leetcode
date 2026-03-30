class Solution {
    public boolean checkStrings(String s1, String s2) {
        if( s1.length() != s2.length()) return false;

        Map<Character,Integer> even1 = new HashMap<>();
        Map<Character,Integer> even2 = new HashMap<>();
        Map<Character,Integer> odd1 = new HashMap<>();
        Map<Character,Integer> odd2 = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if( i % 2 == 0){
                even1.put(c1, even1.getOrDefault(c1,0)+1);
                even2.put(c2, even2.getOrDefault(c2,0)+1);
            }else{
                odd1.put(c1, odd1.getOrDefault(c1,0)+1);
                odd2.put(c2, odd2.getOrDefault(c2,0)+1);
            }
        }
        return even1.equals(even2) && odd1.equals(odd2);
    }
}