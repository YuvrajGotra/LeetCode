class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        if(k == 0) return true;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                
                for(int j: set) {
                    if(i-j-1 < k) return false;
                }

                set.add(i);
            }
        }

        return true;
    }
}