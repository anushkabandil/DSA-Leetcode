class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int MOD = 12345;
        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;

        // FLATTENED GRID
         int [] arr = new int [size];
         int idx = 0;
         int zeroCount = 0;

         for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[idx] = grid[i][j];
                if(arr[idx] == 0) zeroCount++;
                idx++;
            }
         }
         int[] result = new int[size];
        
        // Case 1: More than one zero
        if (zeroCount > 1) {
            // All values remain 0
        }
        
        // Case 2: Exactly one zero
        else if (zeroCount == 1) {
            long prod = 1;
            for (int x : arr) {
                if (x != 0) {
                    prod = (prod * x) % MOD;
                }
            }
            
            for (int i = 0; i < size; i++) {
                if (arr[i] == 0) {
                    result[i] = (int) prod;
                } else {
                    result[i] = 0;
                }
            }
        }
        
        // Case 3: No zeros
        else {
            long[] prefix = new long[size];
            long[] suffix = new long[size];
            
            prefix[0] = 1;
            for (int i = 1; i < size; i++) {
                prefix[i] = (prefix[i - 1] * arr[i - 1]) % MOD;
            }
            
            suffix[size - 1] = 1;
            for (int i = size - 2; i >= 0; i--) {
                suffix[i] = (suffix[i + 1] * arr[i + 1]) % MOD;
            }
            
            for (int i = 0; i < size; i++) {
                result[i] = (int) ((prefix[i] * suffix[i]) % MOD);
            }
        }
        
        // Convert back to 2D matrix
        int[][] p = new int[n][m];
        idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p[i][j] = result[idx++];
            }
        }
        
        return p;
    }
}