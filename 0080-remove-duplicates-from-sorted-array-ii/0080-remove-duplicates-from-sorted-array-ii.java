class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0, j = 0;
        int cnt = 1;
        int n = nums.length;

        while(j != n) {
            if(nums[i] == nums[j]) {
                if(cnt <= 2) {
                    arr.add(nums[i]);
                }
                cnt++;
                j++;
            }
            else {
                cnt = 1;
                i = j;
            }
        }
        
        for(int k = 0; k < arr.size(); k++) {
            nums[k] = arr.get(k);
        }

        return arr.size();
    }
}