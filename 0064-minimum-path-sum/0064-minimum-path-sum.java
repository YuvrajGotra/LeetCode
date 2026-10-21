class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length-1;
        int n = grid[0].length-1;
        int[][] dp = new int[m+1][n+1];

        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }

        return path(grid, m, n, dp);
    }

    public int path(int[][] grid, int m, int n, int[][] dp) {
        if(m < 0 || n < 0) return Integer.MAX_VALUE;
        if(m == 0 && n == 0) return grid[0][0];
        if(dp[m][n] != -1) return dp[m][n];

        int up = path(grid, m, n-1, dp);
        int down = path(grid, m-1, n, dp);

        return dp[m][n] = grid[m][n] + Math.min(up, down);
    }
}