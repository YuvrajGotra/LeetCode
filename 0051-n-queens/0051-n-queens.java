class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] chessBoard = new char[n][n];
        List<List<String>> res = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                chessBoard[i][j] = '.';
            }
        }

        nQueens(0, chessBoard, res);

        return res;
    }

    public void nQueens(int row, char[][] chessBoard, List<List<String>> res) {
        int n = chessBoard.length;

        if(row == n) {
            List<String> list = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                StringBuilder l = new StringBuilder();

                for(int j = 0; j < n; j++) {
                    l.append(chessBoard[i][j]);
                }

                list.add(l.toString());
            }

            res.add(list);
            return;
        }

        for(int col = 0; col < n; col++) {
            if(check(row, col, chessBoard)) {
                chessBoard[row][col] = 'Q';  // mark
                nQueens(row+1, chessBoard, res);  // next row
                chessBoard[row][col] = '.'; // unmark
            }
        }
    }

    public boolean check(int row, int col, char[][] chessBoard) {
        // check up
        int i = row-1;
        while(i >= 0) {
            if(chessBoard[i][col] == 'Q') return false;
            i--;
        }

        // check left diag
        i = row-1;
        int j = col-1;
        while(i >= 0 && j >= 0) {
            if(chessBoard[i][j] == 'Q') return false;
            i--;
            j--;
        }

        // check right diag
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