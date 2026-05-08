class Solution {
    // public int minPathSum(int[][] grid) {
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     int[][] dp = new int[m][n];
    //     for(int[] r : dp){
    //         Arrays.fill(r,-1);
    //     }
    //     return solve2(m-1, n-1, grid, dp);
    // }
    // public static int solve(int m , int n , int [][] grid, int[][]dp){
    //     if(m == 0 && n == 0) return grid[0][0];
    //     if(m < 0 || n < 0) return (int) 1e9;

    //     if( dp[m][n] != -1) return dp[m][n];

    //     int up = grid[m][n] + solve(m-1, n, grid, dp);
    //     int left = grid[m][n] + solve(m, n-1, grid, dp);

    //     return  dp[m][n]= Math.min (up, left);
    // }


     public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for(int i =0; i < m; i++){
            for(int j =0; j < n; j++){
                if( i ==0 && j==0){
                    dp[i][j] = grid [i][j];
                } 
                else{
                    int up = grid[i][j];
                    if(i>0)  up += dp[i-1][j];
                    else up += (int)1e9;
                    
                    int left = grid[i][j];
                    if(j>0) left += dp[i][j-1];
                    else left += (int)1e9;
                    
                     dp[i][j]= Math.min (up, left);
                }
            }
        }
        return dp[m-1][n-1];
    }
}