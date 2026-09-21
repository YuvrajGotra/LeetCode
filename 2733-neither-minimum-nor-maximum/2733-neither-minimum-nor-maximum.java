class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = -1;

        for(int ele: nums) {
            max = Math.max(max, ele);
            min = Math.min(min, ele);
        }

        for(int ele: nums) {
            if(max == ele || min == ele) continue;
            res = ele;
        }

        return res;
    }
}