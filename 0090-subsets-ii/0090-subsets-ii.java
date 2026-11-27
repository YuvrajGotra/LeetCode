class Solution {
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> temp, int idx) {
        res.add(new ArrayList<>(temp));

        for(int i = idx; i < nums.length; i++) {
            if(i > idx && nums[i] == nums[i-1]) continue;

            temp.add(nums[i]);
            helper(nums, res, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums);

        helper(nums, res, temp, 0);

        // Set<List<Integer>> set = new HashSet<>();

        // for(List<Integer> ele: res) {
        //     set.add(ele);
        // }

        // res.clear();

        // for(List<Integer> ele: set) {
        //     res.add(ele);
        // }

        return res;
    }
}