class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for(int ele : nums) {
            if(set.contains(ele)) dup.add(ele);
            set.add(ele);
        }

        for(int ele : dup) {
            set.remove(ele);
        }

        int sum = 0;
        for(int ele : set) sum += ele;

        return sum;
    }
}