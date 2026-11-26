class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(!vis[i]) {
                cnt++;

                vis[i] = true;
                q.add(i);

                while(!q.isEmpty()) {
                    int node = q.remove();

                    for(int j = 0; j < n; j++) {
                        if(isConnected[node][j] == 1 && !vis[j]) {
                            vis[j] = true;
                            q.add(j);
                        }
                    }
                }
            }
        }

        return cnt;
    }
}