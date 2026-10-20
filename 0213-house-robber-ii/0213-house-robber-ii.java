class Solution {
    public static int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        dp = new int[n];
        Arrays.fill(dp, -1);

        int a = robbed(nums, 0, n-2);
        Arrays.fill(dp, -1);

        int b = robbed(nums, 1, n-1);

        return Math.max(a, b);
    }

    public int robbed(int[] nums, int s, int e) {
        if(s > e) return 0;
        if(dp[s] != -1) return dp[s];

        int l = nums[s] + robbed(nums, s+2, e);
        int r = robbed(nums, s+1, e);

        return dp[s] = Math.max(l, r);
    }
}