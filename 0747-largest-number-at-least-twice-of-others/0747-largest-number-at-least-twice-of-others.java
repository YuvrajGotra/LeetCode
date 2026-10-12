class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int idx = 0;
        int l = nums.length;

        for(int i = 0; i < l; i++) {
            if(max < nums[i]) {
                idx = i;
                max = nums[i];
            }
        }

        for(int i = 0; i < l; i++) {
            if(i == idx) continue;
            else {
                int temp = nums[i] * 2;
                if(temp <= max) continue;
                else return -1;
            }
        }

        return idx;
    }
}