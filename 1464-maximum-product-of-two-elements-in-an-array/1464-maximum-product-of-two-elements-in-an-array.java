class Solution {
    public int maxProduct(int[] nums) {
        int fmax = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while(j != nums.length) {
            if(fmax < nums[j]) {
                fmax = nums[j];
                i = j;
            }
            j++;
        }

        int smax = Integer.MIN_VALUE;
        int k = 0;
        j = 0;

        while(j != nums.length) {
            if(i == j) {
                j++;
                continue;
            }
            else if(smax < nums[j]) {
                smax = nums[j];
                k = j;
            }
            j++;
        }

        return (fmax-1) * (smax-1);
    }
}