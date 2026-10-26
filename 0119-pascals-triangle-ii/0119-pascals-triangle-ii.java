class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            if(rowIndex == 0) return temp;

            if(i > 0) {
                List<Integer> prev = res.get(i-1);

                for(int j = 1; j < i; j++) {
                    int sum = prev.get(j-1) + prev.get(j);
                    temp.add(sum);
                }

                temp.add(1);
            }

            res.add(temp);
        }

        return res.get(res.size()-1);
    }
}