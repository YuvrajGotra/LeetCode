class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int last = Integer.MIN_VALUE;

        for(int ele : nums) set.add(ele);

        for(int ele : nums) {
            if(last < ele) last = ele;
        }

        for(int i = 0; i <= last; i++) {
            if(!set.contains(i)) return i;
        }

        return last+1;
    }
}