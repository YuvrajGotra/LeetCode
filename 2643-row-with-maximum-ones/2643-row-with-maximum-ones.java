class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) cnt++;
            }
            if(cnt == max) continue;
            else if(cnt > max) {
                res[0] = i;
                res[1] = cnt;
                max = cnt;
            }
        }

        return res;
    }
}