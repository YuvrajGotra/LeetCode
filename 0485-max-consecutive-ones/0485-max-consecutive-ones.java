class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i : nums) {
            if(i == 1) {
                cnt++;
            }
            else {
                if(max < cnt) max = cnt;
                cnt = 0;
            }
        }

        if(max < cnt) max = cnt;

        return max;
    }
}