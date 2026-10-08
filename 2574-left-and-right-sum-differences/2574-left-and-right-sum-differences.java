class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] t1 = new int[n];
        int sum = 0;

        for(int i = 1; i < n; i++) {
            sum += nums[i-1];
            t1[i] = sum;
        }

        int[] t2 = new int[n];
        sum = 0;

        for(int i = n-2 ; i >= 0; i--) {
            sum += nums[i+1];
            t2[i] = sum;
        }

        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            sum = 0;
            sum += Math.abs(t1[i] - t2[i]);
            res[i] = sum;
        }

        return res;
    }
}