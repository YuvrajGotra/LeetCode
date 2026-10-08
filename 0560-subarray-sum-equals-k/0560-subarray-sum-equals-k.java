class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int currSum = 0;
        int cnt = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            currSum += nums[i];

            int need = currSum - k;

            if(map.containsKey(need)) {
                cnt += map.get(need);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return cnt;
    }
}