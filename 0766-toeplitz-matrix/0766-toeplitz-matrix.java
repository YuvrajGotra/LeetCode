class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int t = matrix[0][0];
        
        int m = matrix.length;
        int n = matrix[0].length;
        int idx = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i-1 >= 0 && j-1 >= 0 && matrix[i-1][j-1] != matrix[i][j]) return false;
            }
        }

        return true;
    }
}