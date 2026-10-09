class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int currSum = 0;
        int cnt = 0;

        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            int rem = currSum % k;

            if(rem < 0) rem += k;

            cnt += map.getOrDefault(rem, 0);

            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        
        return cnt;
    }
}