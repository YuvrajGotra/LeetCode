class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int ele: nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int[] res = new int[2];
        int idx = 0;

        for(int ele: map.keySet()) {
            int temp = map.get(ele);

            if(temp == 1) {
                res[idx++] = ele;
            }
        }

        return res;
    }
}