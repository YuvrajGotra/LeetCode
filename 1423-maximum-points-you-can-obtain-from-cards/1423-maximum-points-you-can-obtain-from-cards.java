class Solution {
    public int maxScore(int[] num, int k) {
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;

        for(int i = 0; i < k; i++) lSum += num[i];

        int idx = num.length-1;
        maxSum = lSum;

        for(int i = k-1; i >= 0; i--) {
            lSum -= num[i];
            rSum += num[idx];
            idx--;

            if(lSum+rSum > maxSum) maxSum = lSum+rSum;
        }

        return maxSum;
    }
}