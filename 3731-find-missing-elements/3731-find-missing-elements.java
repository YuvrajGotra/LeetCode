class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        List<Integer> arr = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) max = nums[i];
            if(min > nums[i]) min = nums[i];
            arr.add(nums[i]);
        }

        for(int i = min; i <= max; i++) {
            if(!arr.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }
}