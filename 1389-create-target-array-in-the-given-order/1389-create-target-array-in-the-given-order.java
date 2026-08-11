class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < index.length; i++) {
            arr.add(index[i], nums[i]);
        }

        int[] res = new int[arr.size()];
        int idx = 0;
        for(int i : arr) {
            res[idx] = i;
            idx++;
        }

        return res;
    }
}