class Solution {
    public boolean safe(int row,int col,List<String> r,int n){
        for(int i = 0;i<row;i++){
            if(r.get(i).charAt(col) == 'Q'){
                return false;
            }
        }
        int j = col - 1;
        for(int i = row - 1;i>=0 && j>=0;i--){
            if(r.get(i).charAt(j) == 'Q'){
                return false;
            }
            j--;
        }
        j = col + 1;
        for(int i = row - 1;i>=0 && j<n;i--){
            if(r.get(i).charAt(j) == 'Q'){
                return false;
            }
            j++;
        }

        return true;
    }

    public void boom(List<List<String>> ans,int n,int row,List<String> r){
        if(row == n){
            ans.add(new ArrayList<>(r));
            return;
        }
        
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<n;i++){
            str.append('.');
        }
        int i = row;
            for(int j = 0;j<n;j++){
                if(safe(i,j,r,n)){
                    str.setCharAt(j,'Q');
                    r.add(str.toString());
                    boom(ans,n,row+1,r);
                    r.remove(r.size()-1);
                    str.setCharAt(j,'.');
                }
            }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> r =  new ArrayList<>();
        boom(ans,n,0,r);
        return ans;
    }
}