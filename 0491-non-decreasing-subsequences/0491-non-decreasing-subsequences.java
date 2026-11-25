class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(nums, res, temp, 0);

        return res;
    }

    public void helper(int[] nums, List<List<Integer>> res, List<Integer> temp, int start) {
        if(temp.size() >= 2) {
            for(int i = 1; i < temp.size(); i++) {
                if(temp.get(i-1) <= temp.get(i)) continue;
                else return ;
            }

            res.add(new ArrayList<>(temp));
        }

        Set<Integer> used = new HashSet<>();

        for(int i = start; i < nums.length; i++) {
            if (!used.add(nums[i])) {
                continue;
            }
            
            temp.add(nums[i]);
            helper(nums, res, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}