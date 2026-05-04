class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int [][] dp = new int[m][n];
        for(int[] r : dp){
             Arrays.fill(r,-1);
        }

        return solve(m-1, n-1, obstacleGrid,dp);

    }
    public static int solve(int m, int n, int[][] obstacleGrid, int [][] dp){

        if(m >= 0 && n >= 0 && obstacleGrid[m][n] == 1) return 0;
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;

// MEMOIZAION
         if (dp[m][n] != -1) return dp[m][n];

        int up = solve(m-1, n, obstacleGrid, dp);
        int left = solve(m, n-1, obstacleGrid, dp);

        return dp[m][n] = up + left;
    }
}