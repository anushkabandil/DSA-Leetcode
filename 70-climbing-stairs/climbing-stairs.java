class Solution {
    public int climbStairs(int n) {
          int prev2 = 1; // f(1)
          int prev1 = 2; // f(2)

        if(n<=2) return n;

         for(int i = 3; i<=n ; i++){
            int curr_i = prev1 + prev2;
            prev2 = prev1;
            prev1= curr_i;
          }
          return prev1;
    }
}