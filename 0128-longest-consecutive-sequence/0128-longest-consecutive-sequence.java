class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int ele: nums) set.add(ele);

        int maxLen = 0;
        int l = 0;

        for(int ele: set) {
            if(!set.contains(ele-1)) {
                l = 1;

                while(set.contains(ele+l)) {
                    l++;
                }

                maxLen = Math.max(maxLen, l);
            }
        }

        return maxLen;
    }
}