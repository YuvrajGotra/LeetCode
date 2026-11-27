class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == sr && j == sc) {
                    int temp = image[i][j];
                    Queue<Pair> q = new LinkedList<>();
                    q.add(new Pair(i, j));

                    image[i][j] = color;

                    while(!q.isEmpty()) {
                        Pair remove = q.poll();

                        int row = remove.row;
                        int col = remove.col;

                        if(row+1 < m && image[row+1][col] == temp && image[row+1][col] != color) {
                            image[row+1][col] = color;
                            q.add(new Pair(row+1, col));
                        }

                        if(row-1 >= 0 && image[row-1][col] == temp && image[row-1][col] != color) {
                            image[row-1][col] = color;
                            q.add(new Pair(row-1, col));
                        }

                        if(col+1 < n && image[row][col+1] == temp && image[row][col+1] != color) {
                            image[row][col+1] = color;
                            q.add(new Pair(row, col+1));
                        }

                        if(col-1 >= 0 && image[row][col-1] == temp && image[row][col-1] != color) {
                            image[row][col-1] = color;
                            q.add(new Pair(row, col-1));
                        }
                    }
                }
            }
        }

        return image;
    }
}