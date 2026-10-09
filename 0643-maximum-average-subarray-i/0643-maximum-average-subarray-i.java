class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        int sum = 0;

        while(j != nums.length) {
            sum += nums[j];

            if(j-i+1 == k) {
                double t = (double) sum / k;
                max = Math.max(max, t);
                while(j-i+1 >= k) {
                    sum -= nums[i];
                    i++;
                }
            }

            j++;
        }
        
        return max;
    }
}