class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        helper(nums, res, temp, check);
        return res;
    }

    public void helper(int[] nums, List<List<Integer>> res, List<Integer> temp, boolean[] check) {
        if(temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return ;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!check[i]) {
                temp.add(nums[i]);
                check[i] = true;
                helper(nums, res, temp, check);
                temp.remove(temp.size()-1);
                check[i] = false;
            }
        }
    }
}