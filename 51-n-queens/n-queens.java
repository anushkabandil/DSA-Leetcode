class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean [][] board = new boolean [n][n];
        return queens(board, 0);
        
    }

    static List<List<String>> queens(boolean [][] board, int row){

         List<List<String>> list = new ArrayList<>();

        // REACHED THE LAST ROW ON BOARD
        if( row == board.length){
            list.add(construct(board));
            return list;
        }

        // PLACING THE QUEEN AND CHECK FOR EVERY ROW AND COLumn
        for(int col = 0; col < board.length ; col++){
            if( isSafe( board, row, col)){ 
                board[row][col] = true;       
                list.addAll( queens(board, row + 1) );
                board[row][col] = false; }
        }

        return list;
    }

    static List<String> construct(boolean [] [] board){
        List<String> list = new ArrayList<>();

        for(boolean [] row : board){
             StringBuilder sb = new StringBuilder();

            for (boolean element : row) {
                if (element) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }

            list.add(sb.toString());
        }
        return list;
    }

    public static boolean isSafe(boolean[][] board, int row, int col){ // CHECK VERTICAL ROW 
    for(int i =0; i< row; i++){ 
        if(board[i][col]){
             return false;
         } 
    }
    
     // DIAGONAL LEFT
      int maxLeft = Math.min(row, col); 
      for(int i = 1; i <= maxLeft; i++){ 
             if(board[row - i][col - i]){
             return false;
             }
         } 
         
     // DIAGONAL right     
     int maxRight = Math.min(row, board.length - col - 1); 
     for(int i = 1; i <= maxRight; i++){
         if(board[row - i][col + i]){ 
            return false; 
        } 
     } 
     return true;
   }

}