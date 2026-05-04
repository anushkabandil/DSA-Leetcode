class Solution {
    public int uniquePaths(int m, int n) {
        int row = m-1;
        int colm = n-1;
        String path = "";
        int[][] dp = new int [m][n];
         for(int[] rows : dp){
            Arrays.fill(rows, -1);
         }

        return solve(row, colm, dp, path);   
    }

    public static int solve(int row , int colm, int[][] dp, String path ){

        if(row == 0 && colm == 0) return 1;
        if(row < 0 || colm < 0) return 0;

        if(dp[row][colm] != -1) return dp[row][colm];

            int down = solve(row-1, colm, dp, path + "D");
            int right = solve(row, colm-1, dp, path+ "R");

       return dp[row][colm] = down + right;  
    }
}