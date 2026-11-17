class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums);

        helper(nums, list, temp, 0);

        Set<List<Integer>> set = new HashSet<>();
        for(List<Integer> ele: list) {
            set.add(ele);
        }

        list.clear();

        for(List<Integer> ele: set) {
            list.add(ele);
        }


        return list;
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