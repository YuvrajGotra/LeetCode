class Solution {
    public int[] dp;

    public int fibo(int n) {
        if(n == 0 || n == 1) return n;
        if(dp[n] != -1) return dp[n];

        int ans = fibo(n-1) + fibo(n-2);

        return dp[n] = ans;
    }

    public int fib(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return fibo(n);
    }
}