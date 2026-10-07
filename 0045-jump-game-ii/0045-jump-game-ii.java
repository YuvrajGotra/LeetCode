class Solution {
    public int fun(int[] nums) {
        int jump = 0;

        int coverage = 0, lastjumpIdx = 0;

        for(int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i+nums[i]);

            if(i == lastjumpIdx) {
                lastjumpIdx = coverage;
                jump++;

                if(coverage >= nums.length-1) {
                    return jump;
                }
            }
        }

        return jump;
    }

    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        return fun(nums);
    }
}