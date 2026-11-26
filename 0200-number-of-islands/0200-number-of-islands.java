class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int cnt = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !vis[i][j]) {
                    vis[i][j] = true;
                    Queue<Pair> q = new LinkedList<>();
                    q.add(new Pair(i, j));
                    cnt ++;

                    while(!q.isEmpty()) {
                        Pair temp = q.poll();

                        int row = temp.row;
                        int col = temp.col;

                        if(row+1 < m && grid[row+1][col] == '1' && !vis[row+1][col]) {
                            vis[row+1][col] = true; 
                            q.add(new Pair(row+1, col));
                        }

                        if(row-1 >= 0 && grid[row-1][col] == '1' && !vis[row-1][col]) {
                            vis[row-1][col] = true; 
                            q.add(new Pair(row-1, col));
                        }

                        if(col+1 < n && grid[row][col+1] == '1' && !vis[row][col+1]) {
                            vis[row][col+1] = true; 
                            q.add(new Pair(row, col+1));
                        }

                        if(col-1 >= 0 && grid[row][col-1] == '1' && !vis[row][col-1]) {
                            vis[row][col-1] = true; 
                            q.add(new Pair(row, col-1));
                        }
                    }


                }


            }
        }

        return cnt;
    }
}