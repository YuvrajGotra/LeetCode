class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        helper(arr, k, 0, res, temp);

        return res;
    }

    public void helper(int[] arr, int k, int start, List<List<Integer>> res, List<Integer> temp) {
        if(temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return ;
        }

        for(int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            helper(arr, k, i+1, res, temp);
            temp.remove(temp.size()-1);
        }
    }
}