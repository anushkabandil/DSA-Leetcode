class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {

//         int m = obstacleGrid.length;
//         int n = obstacleGrid[0].length;

//         int [][] dp = new int[m][n];
//         for(int[] r : dp){
//              Arrays.fill(r,-1);
//         }

//         return solve(m-1, n-1, obstacleGrid,dp);

//     }
//     public static int solve(int m, int n, int[][] obstacleGrid, int [][] dp){

//         if(m >= 0 && n >= 0 && obstacleGrid[m][n] == 1) return 0;
//         if(m == 0 && n == 0) return 1;
//         if(m < 0 || n < 0) return 0;

// // MEMOIZAION
//          if (dp[m][n] != -1) return dp[m][n];

//         int up = solve(m-1, n, obstacleGrid, dp);
//         int left = solve(m, n-1, obstacleGrid, dp);

//         return dp[m][n] = up + left;
//     }



//TABULATION--------------------------------------------

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
     int m = obstacleGrid.length;
     int n = obstacleGrid[0].length;
     int [][] dp = new int[m][n];

     if(obstacleGrid[0][0] == 1) return 0; 
     dp[0][0] =1;

     for(int i =0; i < m; i++){
        for(int j =0; j < n; j++){

            //obstacle
            if(obstacleGrid[i][j] == 1){
                dp[i][j] = 0;
                continue;
            }

            //skip start cell 
            if( i ==0 && j ==0) continue;

            int up = (i>0)? dp[i-1][j] : 0;
            int left = (j>0)? dp[i][j-1] : 0;

            dp[i][j] = up + left;
        }
     }
     return dp[m-1][n-1];
  }
}