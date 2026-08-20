class Solution {
    boolean solved = false;

    public boolean issafe(char[][] board,int row,int col,int num){
        for(int i = 0;i<=8;i++){
            if(board[i][col] == (char)(num + '0') && i!= row){
                return false;
            }
        }

        for(int i = 0;i<=8;i++){
            if(board[row][i] == (char)(num + '0') && i != col){
                return false;
            }
        }

        // for each small square section;
        int strtRow = (row/3)*3;
        int strtCol = (col/3)*3;

        for(int i = strtRow;i<strtRow+3;i++){
            for(int j = strtCol;j<strtCol+3;j++){
                if(board[i][j] == (char)(num + '0') && (i!= row && j!= col)){
                    return false;
                }
            }
        }

        return true;
    }

    public void boom (char[][] board,int i,int j){
        // base case
        if(i == 9){
            solved = true;
            return;
        }

        int newRow = i;int newCol = j+1;
        if(j+1 == 9){
            newRow++;
            newCol = 0;
        }
        if(board[i][j] != '.'){
            boom(board,newRow,newCol);
        }else{
            for(int n = 1;n<=9;n++){
                if(issafe(board,i,j,n)){
                    board[i][j] = (char)(n + '0');
                    boom(board,newRow,newCol);
                    if(solved){
                        return;
                    }
                    board[i][j] = '.';
                }
            }
        }
    }
    public void solveSudoku(char[][] board) {
        boom(board,0,0);
    }
}