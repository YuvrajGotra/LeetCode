class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);

        helper(candidates, target, res, temp, 0);

        return res;
    }

    public void helper(int[] arr, int target, List<List<Integer>> res, List<Integer> temp, int start) {
        if(target == 0) {
            res.add(new ArrayList<>(temp));
            return ;
        }

        for(int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            if(arr[i] > target) break;
            temp.add(arr[i]);
            helper(arr, target-arr[i], res, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}