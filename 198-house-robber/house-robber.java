class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1 ) return nums[0];

        int [] dp = new int[n];
        dp[0] = nums[0];
       
       dp[1]= Math.max(nums[0], nums[1]);

       for(int i = 2; i<n; i++){
            dp[i] =  Math.max(nums[i] + (dp[i-2]), (dp[i-1]));
       }

        return dp[n-1];
    }
    // public static int solve(int index, int [] nums, int[] dp){
    //     int n = nums.length;
    //     int max = 0;

    //     if(index < 0) return 0;
    //     if(index == 0) return nums[0];
    //     if( dp[index] != -1) return dp[index];

    //     int pick = nums[index] + solve(index - 2, nums, dp);
        
    //     int notPick = solve(index-1, nums, dp);
        
    //     max = Math.max(pick, notPick);

    //     return max;
    // }

}