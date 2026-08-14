class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones) {
            pq.add(i);
        }

        while(pq.size() > 1) {
            int i = pq.remove();
            int j = pq.remove();

            if(i != j) {
                pq.add(i-j);
            }
        }

        return pq.size() == 0 ? 0 : pq.poll();
    }
}