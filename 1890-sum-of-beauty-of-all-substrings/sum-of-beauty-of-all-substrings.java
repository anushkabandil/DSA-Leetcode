class Solution {
    public int beautySum(String s) {
        if( s.length() == 0 ) return 0;

        int sum = 0;

        for( int i = 0; i < s.length(); i++ )
        {
            HashMap<Character, Integer> freq = new HashMap<>();

            for( int j = i; j < s.length() ; j++ )
            {
                freq.put(s.charAt(j) , freq.getOrDefault(s.charAt(j), 0)+1);

                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;

                for(int val : freq.values())
                {
                    mini = Math.min(mini, val);
                    maxi = Math.max(maxi, val);
                }
                sum += ( maxi - mini );
            }
        }
         return sum;
    }
}