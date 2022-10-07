class Solution {
    public boolean isValidSudoku(char[][] board) {
       int [][]rows= new int[9][10];
        int [][]cols= new int[9][10];
        int [][]boxs= new int[9][10];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    int number = Character.getNumericValue(board[i][j]);
                        if(rows[i][number]==number){
                            return false;
                            
                        }
                    rows[i][number]=number;
                        if(cols[j][number]==number){
                            return false;
                           
                        }
                    cols[j][number]=number;
                       int boxnumber =i/3+3*(j/3);
                        if(boxs[boxnumber][number]==number){
                            return false;
                            
                        }
                    boxs[boxnumber][number]=number;
                        
                        
                    }
                }
            }
        
    return true;
}
}