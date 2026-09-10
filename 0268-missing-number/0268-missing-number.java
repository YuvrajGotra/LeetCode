class Solution {
    public int missingNumber(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();

        for(int ele : nums) tree.add(ele);

        int last = tree.last();

        for(int i = 0; i <= last; i++) {
            if(tree.contains(i)) continue;
            else return i;
        }

        return last+1;
    }
}