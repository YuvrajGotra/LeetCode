class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int l = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < l; i++) {
            if(k > 0 && nums[i] < 0) {
                nums[i] = (nums[i] * (-1));
                k--;
            }
        }

        Arrays.sort(nums);

        if(k != 0) {
            while(k > 0) {
                nums[0] *= -1;
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