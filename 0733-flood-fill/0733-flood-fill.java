class Solution {
    public void dfs(int[][] res, int sr, int sc, int color, int temp) {
        if(sr < 0 || sr >= res.length || sc < 0 || sc >= res[0].length) return ;
        if(res[sr][sc] != temp) {
            return ;
        }

        res[sr][sc] = color;

        dfs(res, sr-1, sc, color, temp); // up
        dfs(res, sr+1, sc, color, temp); // down
        dfs(res, sr, sc-1, color, temp); // left
        dfs(res, sr, sc+1, color, temp); // right
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int[][] res = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res[i][j] = image[i][j];
            }
        }

        int temp = res[sr][sc];
        if(temp != color) {
            dfs(res, sr, sc, color, temp);
        }

        return res;
    }
}