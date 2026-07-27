class Solution {
    public int maxProduct(int[] nums) {
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i : nums) {
            if(i > fmax) {
                smax = fmax;
                fmax = i;
            }
            else if(i > smax) {
                smax = i;
            }
        }

        return (fmax-1) * (smax-1);
    }
}