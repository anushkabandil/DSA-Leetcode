class Solution {
    // public int beautySum(String s) {
    //     if( s.length() == 0 ) return 0;

    //     int sum = 0;

    //     for( int i = 0; i < s.length(); i++ )
    //     {
    //         HashMap<Character, Integer> freq = new HashMap<>();

    //         for( int j = i; j < s.length() ; j++ )
    //         {
    //             freq.put(s.charAt(j) , freq.getOrDefault(s.charAt(j), 0)+1);

    //             int maxi = Integer.MIN_VALUE;
    //             int mini = Integer.MAX_VALUE;

    //             for(int val : freq.values())
    //             {
    //                 mini = Math.min(mini, val);
    //                 maxi = Math.max(maxi, val);
    //             }
    //             sum += ( maxi - mini );
    //         }
    //     }
    //      return sum;
    // }



    public int beautySum(String s) {

        int sum = 0;
        
        for(int i = 0; i< s.length() ; i++){
            int [] freq = new int[26];

            for(int j = i; j< s.length() ; j++){

                freq[s.charAt(j) - 'a' ]++;

                int maxi = 0;
                int mini = Integer.MAX_VALUE;

                for(int val : freq){

                    if(val > 0){
                        maxi = Math.max(maxi, val);
                        mini = Math.min(mini, val);
                    }
                }
                sum += (maxi - mini);
            }
        }
        return sum;
    }
}