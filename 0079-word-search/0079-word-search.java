class Solution {
    public boolean fintFirstLetter(char[][]board,int i,int j,int []arr,char ch){
        if(j >= board[0].length){
            i++;
            j = 0;
        }
        if(i >= board.length){
            return false;
        }
        int column = j;
        for(int row = i;row<board.length;row++){
            for(int col = column;col<board[0].length;col++){
                if(board[row][col] == ch){
                    arr[0] = row;
                    arr[1] = col;
                    return true;
                }
                
            }
            column = 0;
        }
        return false;
    }
    public boolean recursion(char[][]board,String word,int i,int j,int orgLen){
        char starting_char = '*';
        int word2 = 0;
        StringBuilder str = new StringBuilder();
        if(word.length() == orgLen){
        int arr[] = new int[2];
        boolean val = fintFirstLetter(board,i,j,arr,word.charAt(0));
        if(!val){
            return false;
        }
        i = arr[0];
        j = arr[1];
        starting_char = board[i][j];
        board[i][j] = '*';
        str.append(word);
        word2 = word.length();
        word = word.substring(1);
        }

        if(word.length()==0){
            return true;
        }
        char ch = word.charAt(0);
         if(!(j + 1 >= board[0].length) && board[i][j+1] == ch){
            char c = board[i][j+1];
            board[i][j+1] = '*';
            boolean val = recursion(board,word.substring(1),i,j+1,orgLen);
            if(val){
                return true;
            }
            board[i][j+1] = c;
        }
         if(!(i + 1 >= board.length) && board[i + 1][j] == ch){
            char c = board[i + 1][j];
            board[i + 1][j] = '*';
            boolean val = recursion(board,word.substring(1),i + 1,j,orgLen);
            if(val){
                return true;
            }
            board[i + 1][j] = c;
        }
          if(!(j - 1 < 0) && board[i][j - 1] == ch){
            char c = board[i][j - 1];
            board[i][j - 1] = '*';
            boolean val = recursion(board,word.substring(1),i,j-1,orgLen);
            if(val){
                return true;
            }
            board[i][j - 1] = c;
        }
         if(!(i - 1 < 0) && board[i - 1][j] == ch){
            char c = board[i - 1][j];
            board[i - 1][j] = '*';
            boolean val = recursion(board,word.substring(1),i-1,j,orgLen);
            if(val){
                return true;
            }
            board[i - 1][j] = c;
        }
        if(word2 == orgLen){
            board[i][j] =  starting_char;
            
            return recursion(board,str.toString(),i,j+1,orgLen);
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0){
            return true;
        }
        return recursion(board,word,0,0,word.length());
    }
}