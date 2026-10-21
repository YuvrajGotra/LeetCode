class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        bf(nums, 0);
        return res;
    }
    
    public void bf(int[] nums, int s) {
        res.add(new ArrayList<>(path));

        for(int i = s; i < nums.length; i++) {
            path.add(nums[i]);
            bf(nums, i+1);
            path.remove(path.size()-1);
        }
    }
}