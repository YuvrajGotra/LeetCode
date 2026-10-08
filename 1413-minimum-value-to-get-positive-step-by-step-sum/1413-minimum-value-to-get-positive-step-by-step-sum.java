class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;

        for(int ele: nums) {
            sum += ele;
            min = Math.min(min, sum);
        }

        return 1-min;
    }
}