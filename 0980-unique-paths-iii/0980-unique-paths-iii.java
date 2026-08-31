class Solution {
    int answer = 0;
    public void recursion(int i,int j,int validSteps,int [][] grid){
        if(j>=grid[0].length || i>=grid.length || j<0 || i<0){
            return;
        }
        if(grid[i][j] == 1){
            grid[i][j] = 0;
        }
        if(grid[i][j] == 0){
        //right
        grid[i][j] = -1;
        recursion(i,j + 1,validSteps-1,grid);

        //down
        recursion(i+1,j,validSteps-1,grid);

        //left
        recursion(i,j - 1,validSteps-1,grid);

        //up
        recursion(i - 1,j,validSteps-1,grid);
        grid[i][j] = 0;
        }
        else if(grid[i][j] == 2 && validSteps == -1){
            answer++;
        }
    }

    public int uniquePathsIII(int[][] grid) {
        int validSteps = 0;
        int startI = 0;
        int startJ = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    validSteps++;
                }
                if(grid[i][j] == 1){
                    startI = i;
                    startJ = j;
                }
            }
        }
        recursion(startI,startJ,validSteps,grid);
        return answer;
    }
}