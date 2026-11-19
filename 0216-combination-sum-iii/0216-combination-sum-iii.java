class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(k > n) return res;
        List<Integer> temp = new ArrayList<>();

        int[] arr = new int[9];
        for(int i = 0; i < 9; i++) {
            arr[i] = i+1;
        }

        helper(k, n, res, temp, arr, 0);

        return res;
    }

    public void helper(int k, int n, List<List<Integer>> res, List<Integer> temp, int[] arr, int start) {
        if(temp.size() == k && n == 0) {
            res.add(new ArrayList<>(temp));
            return ;
        }

        for(int i = start; i < arr.length; i++) {
            if(n < 0) continue;
            temp.add(arr[i]);
            helper(k, n-arr[i], res, temp, arr, i+1);
            temp.remove(temp.size()-1);
        }
    }
}