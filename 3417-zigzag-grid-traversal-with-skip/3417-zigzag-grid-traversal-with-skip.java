class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        int cnt = 1;

        for(int i = 0; i < grid.length; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < grid[0].length; j++) {
                    if(cnt % 2 != 0) {
                        list.add(grid[i][j]);
                    }
                    cnt++;
                }
            }
            else {
                for(int j = grid[0].length-1; j >= 0; j--) {
                    if(cnt % 2 != 0) {
                        list.add(grid[i][j]);
                    }
                    cnt++;
                }
            }
        }

        return list;
    }
}