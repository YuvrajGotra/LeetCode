class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int l = nums.length;
        int min = Integer.MAX_VALUE;
        int idx = 0;

        Arrays.sort(nums);

        for(int i = 0; i < l; i++) {
            if(k > 0 && nums[i] < 0) {
                nums[i] = (nums[i] * (-1));
                k--;
            }
            if(nums[i] < min) {
                min = nums[i];
                idx = i;
            }
        }

        if(k != 0) {
            while(k > 0) {
                nums[idx] *= -1;
                k--;
            }
        }

        int sum = 0;

        for(int ele: nums) {
            sum += ele;
        }

        return sum;
    }
}