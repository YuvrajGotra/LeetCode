class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(j != n) {
            if(nums[i] == nums[j]) {
                j++;
            }
            else {
                arr.add(nums[i]);
                i = j;
            }
        }

        arr.add(nums[i]);

        for(int k = 0; k < arr.size(); k++) {
            nums[k] = arr.get(k);
        }

        return arr.size();
    }
}