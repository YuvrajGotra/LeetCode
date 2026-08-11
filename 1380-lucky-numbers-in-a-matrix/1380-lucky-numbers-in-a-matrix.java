class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {
            
            int minRow = Integer.MAX_VALUE;
            int minVal = Integer.MAX_VALUE;

            for(int j = 0; j < matrix[0].length; j++) {
                if(minVal > matrix[i][j]) {
                    minRow = j;
                    minVal = matrix[i][j];
                }
            }
            
            boolean lucky = true;

            for(int k = 0; k < matrix.length; k++) {
                if(matrix[k][minRow] > minVal) {
                    lucky = false;
                    break;
                }
            }

            if(lucky) {
                res.add(minVal);
            }
        }

        return res;
    }
}