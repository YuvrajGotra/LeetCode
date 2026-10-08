class Solution {
    public int waysToSplitArray(int[] nums) {
        long total = 0;
        int n = nums.length;

        for(int ele: nums) total += ele;

        long leftSum = 0;
        int cnt = 0;

        for(int i = 0; i < n-1; i++) {
            leftSum += nums[i];

            long rightSum = total - leftSum;

            if(leftSum >= rightSum) cnt++;
        }

        return cnt;
    }
}