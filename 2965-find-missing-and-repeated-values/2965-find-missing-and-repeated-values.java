class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid[0].length;
        int sum = 0;
        int actual_sum = (n*n)*((n*n)+1)/2;
        int square_sum = 0;
        int actual_square_sum = 0;
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                sum += grid[i][j];
                square_sum += grid[i][j]*grid[i][j];
                actual_square_sum += num * num;
                num++;
            }
        }
        int sum_difference = actual_sum - sum;
        int addition = ((actual_square_sum) - (square_sum))/(sum_difference);
        int arr[] = new int[2];
        arr[1] = (addition + sum_difference)/2;
        arr[0] = addition - arr[1];
        return arr;

    }
}