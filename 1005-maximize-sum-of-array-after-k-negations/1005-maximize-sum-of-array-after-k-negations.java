class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int l = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < l; i++) {
            if(nums[i] < 0 && k != 0) {
                nums[i] = nums[i] * -1;
                k--;
            }
        }

        int min = Integer.MAX_VALUE;
        int idx = 0;

        for(int i = 0; i < l; i++) {
            if(min > nums[i]) {
                min = nums[i];
                idx = i;
            }
        }

        while(k != 0) {
            nums[idx] = nums[idx] * -1;
            k--;
        }

        int sum = 0;
        for(int ele: nums) sum += ele;

        return sum;
    }
}