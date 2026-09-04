class Solution {
    public void bfs(int i, boolean[] visited, int[][] isConnected) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;

        while(q.size() > 0) {
            int front = q.remove();

            for(int j = 0; j < isConnected[0].length; j++) {
                if(isConnected[front][j] == 1 && !visited[j]) {
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];

        int cnt = 0;

        for(int i = 0; i < isConnected.length; i++) {
            if(!visited[i]) {
                bfs(i, visited, isConnected);
                cnt++;
            }
        }

        return cnt;
    }
}