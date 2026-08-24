class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(0) - 'a' + 1;
        int b = 0;

        if(a % 2 == 0) b = 1;
        else b = 0;

        int c = coordinates.charAt(1) - '0';

        for(int i = 1; i <= c; i++) {
            if(b == 0) b = 1;
            else b = 0;
        } 

        return b == 0 ? true : false;
    }

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean check1 = squareIsWhite(coordinate1);
        boolean check2 = squareIsWhite(coordinate2);

        return check1 == check2;
    }
}