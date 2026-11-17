class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(nums, res, temp, 0);

        return res;
    }

    public void helper(int[] nums, List<List<Integer>> res, List<Integer> temp, int idx) {
        res.add(new ArrayList<>(temp));

        for(int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(nums, res, temp, i+1);
            temp.remove(temp.size()-1);
        }


    }
}