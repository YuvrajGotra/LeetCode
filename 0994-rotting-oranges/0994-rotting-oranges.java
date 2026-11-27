class Triple {
    int row;
    int col;
    int time;

    Triple(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<Triple> q = new LinkedList<>();

        int[][] res = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Triple(i, j, 0));
                }
                res[i][j] = grid[i][j];
            }
        }

        int t1 = 0;

        while(!q.isEmpty()) {
            Triple t = q.poll();

            int row = t.row;
            int col = t.col;
            int time = t.time;

            t1 = Math.max(time, t1);

            if(row-1 >= 0 && res[row-1][col] == 1) {
                res[row-1][col] = 2;
                q.add(new Triple(row-1, col, time+1));
            }

            if(row+1 < m && res[row+1][col] == 1) {
                res[row+1][col] = 2;
                q.add(new Triple(row+1, col, time+1));
            }

            if(col-1 >= 0 && res[row][col-1] == 1) {
                res[row][col-1] = 2;
                q.add(new Triple(row, col-1, time+1));
            }

            if(col+1 < n && res[row][col+1] == 1) {
                res[row][col+1] = 2;
                q.add(new Triple(row, col+1, time+1));
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(res[i][j] == 1) return -1;
            }
        }

        return t1;
    }
}