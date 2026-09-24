class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++) {
            int val = nums[i] * nums[i];
            pq.add(val);
        }

        int[] res = new int[pq.size()];
        int idx = 0;

        while(pq.size() > 0) {
            res[idx++] = pq.remove();
        }

        return res;
    }
}