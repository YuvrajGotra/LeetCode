class Solution {
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> temp, int idx) {
        if(temp.size() >= 2) {
            res.add(new ArrayList<>(temp));
        }

        Set<Integer> set = new HashSet<>();

        for(int i = idx; i < nums.length; i++) {
            if(!temp.isEmpty() && nums[i] < temp.get(temp.size()-1)) continue;
            if(!set.add(nums[i])) continue;

            temp.add(nums[i]);
            helper(nums, res, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(nums, res, temp, 0);

        return res;
    }
}