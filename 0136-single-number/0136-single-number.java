class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        
        for(int ele: nums) {
            sum ^= ele;
        }

        return sum;
    }
}