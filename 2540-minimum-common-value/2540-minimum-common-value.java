class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;

        for(int ele: nums1) set.add(ele);

        for(int ele: nums2) {
            if(set.contains(ele)) {
                if(min > ele) {
                    min = ele;
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}