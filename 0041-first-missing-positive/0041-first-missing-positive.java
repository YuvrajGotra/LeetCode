class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele: nums) {
            set.add(ele);
            if(ele >= 0) {
                min = Math.min(min, ele);
                max = Math.max(max, ele);
            } 
        }

        for(int i = 1; i <= max; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }

        return max+1 == Integer.MIN_VALUE+1 ? 1 : max+1;
    }
}