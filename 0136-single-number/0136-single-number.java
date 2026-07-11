class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int i = 0, j = 0, n = nums.length;
        int cnt = 0;

        while(j != n) {
            if(nums[i] == nums[j]) {
                j++;
                cnt++;
            }
            else {
                if(cnt == 1) {
                    return nums[i];
                }
                i = j;
                cnt = 0;
            }
        }

        return nums[i];
    }
}