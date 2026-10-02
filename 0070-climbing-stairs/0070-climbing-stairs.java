class Solution {
    public static int[] dp;

    public int steps(int n) {
        if(n == 0 || n == 1) return 1;
        if(dp[n] != -1) return dp[n];

        return dp[n] = steps(n-1) + steps(n-2);
    }

    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return steps(n);
    }
}