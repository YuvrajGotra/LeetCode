class Solution {
    public int totalNQueens(int n) {
        char[][] chessBoard = new char[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                chessBoard[i][j] = '.';
            }
        }
        int[] cnt = {0};
        nQueens(0, chessBoard, cnt);

        return cnt[0];
    }

    public void nQueens(int row, char[][] chessBoard, int[] cnt) {
        int n = chessBoard.length;

        if(row == n) {
            cnt[0]++;
            return ;
        }

        for(int col = 0; col < n; col++) {
            if(check(row, col, chessBoard)) {
                chessBoard[row][col] = 'Q';
                nQueens(row+1, chessBoard, cnt);
                chessBoard[row][col] = '.';
            }
        }
    }

    public boolean check(int row, int col, char[][] chessBoard) {
        int i = row-1;
        while(i >= 0) {
            if(chessBoard[i][col] == 'Q') return false;
            i--;
        }

        i = row-1;
        int j = col-1;
        while(i >= 0 && j >= 0) {
            if(chessBoard[i][j] == 'Q') return false;
            i--;
            j--;
        }

        i = row-1;
        j = col+1;
        while(i >= 0 && j < chessBoard[0].length) {
            if(chessBoard[i][j] == 'Q') return false;
            i--;
            j++;
        }

        return true;
    }
}