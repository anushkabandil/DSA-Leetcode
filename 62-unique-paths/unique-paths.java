class Solution {
    public int uniquePaths(int m, int n) {
    //     // MEMOIZATION---------------------------------------------------------
        String path = "";
        int[][] dp = new int [m][n];

        // return solve(m-1, n-1, dp, path);
        return solve2(m, n, dp);   
    }
//     // MEMOIZATION---------------------------------------------------------

    // public static int solve(int row , int colm, int[][] dp, String path ){

    //     if(row == 0 && colm == 0) return 1;
    //     if(row < 0 || colm < 0) return 0;

    //     if(dp[row][colm] != -1) return dp[row][colm];

    //         int down = solve(row-1, colm, dp, path + "D");
    //         int right = solve(row, colm-1, dp, path+ "R");

    //    return dp[row][colm] = down + right;  



    //METHOD-2 : TABULATION----------------------------------------------
        
    public static int solve2(int m, int n, int [][] dp){
         // Loop through the grid using two nested loops
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Base condition
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue; 
                }

                int up = 0;
                int left = 0;

                // Check cell above
                if (i > 0)
                    up = dp[i - 1][j];

                // Check cell to the left
                if (j > 0)
                    left = dp[i][j - 1];

                // Total ways to reach this cell
                dp[i][j] = up + left;
            }
        }
        return dp[m - 1][n - 1];
    }
}