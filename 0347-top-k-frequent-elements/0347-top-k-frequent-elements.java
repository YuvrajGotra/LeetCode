class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int ele: nums) map.put(ele, map.getOrDefault(ele, 0)+1);

        PriorityQueue<Integer> pq = new PriorityQueue<>
        ((a, b) -> map.get(a) - map.get(b));

        for(int ele: map.keySet()) {
            pq.add(ele);

            if(pq.size() > k) {
                pq.remove();
            }
        }

        int[] res = new int[k];
        int idx = 0;

        while(pq.size() != 0) {
            res[idx] = pq.remove();
            idx++;
        }

        return res;
    }
}