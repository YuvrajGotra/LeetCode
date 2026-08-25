class Solution {
    public int[][] generateMatrix(int d) {
        int[][] ans = new int[d][d];
        int cnt = 1;

        int m = ans.length, n = ans[0].length;
        int fc = 0, fr = 0, lr = m - 1, lc = n - 1;

        while(fc <= lc && fr <= lr) {

            // left -> right
            for(int i = fc; i <= lc; i++) {
                ans[fr][i] = cnt;
                cnt++;
            }
            fr++;

            if(fr > lr || fc > lc) break;

            // top -> bottom
            for(int i = fr; i <= lr; i++) {
                ans[i][lc] = cnt;
                cnt++;
            }
            lc--;

            if(fr > lr || fc > lc) break;

            // right -> left
            for(int i = lc; i >= fc; i--) {
                ans[lr][i] = cnt;
                cnt++;
            }
            lr--;

            if(fr > lr || fc > lc) break;

            // bottom -> top
            for(int i = lr; i >= fr; i--) {
                ans[i][fc] = cnt;
                cnt++;
            }
            fc++;
        }

        return ans;
    }
}