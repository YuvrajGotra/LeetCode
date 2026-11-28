class Solution {
    public void helper(int[] nums, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp, boolean[] vis) {
        if(temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return ;
        }

        int position = temp.size()+1;

        for(int i = 0; i < nums.length; i++) {
            if(vis[i]) continue;
            int value = nums[i];
            if (value % position != 0 && position % value != 0) {
                continue;
            }

            vis[i] = true;
            temp.add(nums[i]);
            helper(nums, res, temp, vis);
            temp.remove(temp.size()-1);
            vis[i] = false;
        }
    }

    public int countArrangement(int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int[] arr = new int[n];
        boolean[] vis = new boolean[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        helper(arr, res, temp, vis);

        return res.size();
    }
}