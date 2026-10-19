class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> res = new ArrayList<>();

        for(int ele: nums) pq.add(ele);

        int idx = 0;
        while(pq.size() > 0) {
            int ele = pq.remove();
            if(ele == target) res.add(idx);
            idx++;
        }

        return res;
    }
}