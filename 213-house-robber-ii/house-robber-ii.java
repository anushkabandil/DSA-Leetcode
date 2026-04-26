class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = solve1(n-2, nums, dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = solve2(n-1, nums, dp2);

        return Math.max(case1, case2);
    }
// for index -> 0 to n-2
    public static int solve1(int index, int[]nums, int[]dp){

        if(index == 0) return nums[0];
        if(index <0) return 0;
        if (dp[index] != -1) return dp[index];

        int pick = nums[index] + solve1(index-2, nums, dp);
        int notPick = solve1(index-1, nums, dp);
        
       return dp[index] = Math.max(pick,notPick);
    }
// for index -> 1 to n-1
    public static int solve2(int index, int[]nums, int[]dp){        
        if(index <1) return 0;
        if(index == 1) return nums[1];
        if (dp[index] != -1) return dp[index];

        int pick = nums[index] + solve2(index-2, nums, dp);
        int notPick = solve2(index-1, nums, dp);
        
       return dp[index] = Math.max(pick,notPick);
    }
}