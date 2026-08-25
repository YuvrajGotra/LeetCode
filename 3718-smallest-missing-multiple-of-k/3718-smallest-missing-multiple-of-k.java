class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int a = k;

        for(int ele : nums) {
            if(max < ele) max = ele;
            set.add(ele);
        }

        while(a <= max) {
            if(set.contains(a)) {
                a += k;
            }
            else return a;
        }

        return a;
    }
}