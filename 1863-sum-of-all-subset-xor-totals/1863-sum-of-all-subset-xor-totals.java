class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(nums, res, temp, 0);

        int sum = 0;

        for (List<Integer> ele : res) {
            int xor = 0;
            for (int num : ele) {
                xor ^= num;
            }
            sum += xor;
        }

        return sum;
    }

    public void helper(int[] nums, List<List<Integer>> res, List<Integer> temp, int start) {
        if (!temp.isEmpty()) {
            res.add(new ArrayList<>(temp));
        }

        for(int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(nums, res, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}