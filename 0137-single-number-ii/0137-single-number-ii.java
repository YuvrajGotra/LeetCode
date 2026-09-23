class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele: nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1 );
        }

        for(int ele: map.keySet()) {
            int temp = map.get(ele);

            if(temp == 1) {
                return ele;
            }
        }

        return -1;
    }
}