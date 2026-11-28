class Solution {
    public void helper(int[] nums, List<Integer> temp, int[] sum, int idx) {
        if(temp.size() > 0) {
            int t = 0;
            for(int i = 0; i < temp.size(); i++) {
                t ^= temp.get(i);
            }
            sum[0] += t;

            // return ;
        }


        for(int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(nums, temp, sum, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public int subsetXORSum(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        int[] sum = {0};
        helper(nums, temp, sum, 0);

        return sum[0];
    }
}