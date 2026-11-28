class Solution {
    public void helper(int[] nums, int k, List<List<Integer>> res, List<Integer> temp, int idx) {
        if(temp.size() > 0 ) {
            int last = temp.size()-1;

            for(int i = 0; i < last; i++) {
                if(Math.abs(temp.get(last) - temp.get(i)) == k) {
                    return ;
                }
            }

            res.add(new ArrayList<>(temp));
        }

        for(int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(nums, k, res, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public int beautifulSubsets(int[] nums, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(nums, k, res, temp, 0);

        return res.size();
    }
}