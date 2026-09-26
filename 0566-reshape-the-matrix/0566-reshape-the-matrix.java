class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length == r && mat[0].length == c) return mat;

        if(mat.length * mat[0].length != r * c) return mat;

        int[][] res = new int[r][c];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                arr.add(mat[i][j]);
            }
        }

        int idx = 0;
        for(int i = 0; i < res.length; i++) {
            for(int j = 0; j < res[0].length; j++) {
                if(idx == arr.size()) break;
                res[i][j] = arr.get(idx++);
                System.out.print(res[i][j] + " ");
            }
        }

        return res;
    }
}