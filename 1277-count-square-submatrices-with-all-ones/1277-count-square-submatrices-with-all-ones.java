class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int sum = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 1 && i-1 >= 0 && j-1 >= 0) {
                    matrix[i][j] += Math.min(Math.min(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1]);
                }
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}