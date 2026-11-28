class Solution {
    public int helper(int[] nums, int sum, int idx) {
        if(idx == nums.length) {
            return sum;
        }

        return helper(nums, sum^nums[idx], idx+1) + helper(nums, sum, idx+1);
    }

    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
}