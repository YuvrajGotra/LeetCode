class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int p = n/3;

        for(int ele: nums) map.put(ele, map.getOrDefault(ele, 0)+1);

        for(int ele: map.keySet()) {
            if(map.get(ele) > p) list.add(ele);
        }

        return list;
    }
}