class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        boolean[] vis = new boolean[n];
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(!vis[i]) {
                cnt++;
                dfs(i, isConnected, vis);
            }
        }

        return cnt;
    }

    public void dfs(int idx, int[][] isConnected, boolean[] vis) {
        vis[idx] = true;

        for(int j = 0; j < isConnected[0].length; j++) {
            if(isConnected[idx][j] == 1 && !vis[j]) {
                dfs(j, isConnected, vis);
            }
        }
    }
}