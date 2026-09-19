class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxNum = Integer.MIN_VALUE;

        for(int ele: nums) {
            if(ele % 2 == 0) {
                map.put(ele, map.getOrDefault(ele, 0)+1);
            }
        }

        for(int ele: map.keySet()) {
            if(maxNum < map.get(ele)) {
                maxNum = map.get(ele);
            }
        }

        int res = Integer.MAX_VALUE;

        for(int ele: map.keySet()) {
            if(map.get(ele) == maxNum) {
                if(res > ele) res = ele;
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}