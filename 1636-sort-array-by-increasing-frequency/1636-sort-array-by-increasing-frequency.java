class Pair {
    int ele;
    int freq;

    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele: nums) {
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>
        ((a, b) -> 
            {
                if(a.freq == b.freq) return Integer.compare(b.ele, a.ele);
                else return Integer.compare(a.freq, b.freq);
            }
        );

        for(int ele: map.keySet()) {
           pq.add(new Pair(ele, map.get(ele)));
        }

        int cnt = 0;
        while(cnt != nums.length) {
            Pair t = pq.remove();

            int ele = t.ele;
            int freq = t.freq;

            while(freq-- > 0) {
                nums[cnt++] = ele;
            }
        }

        return nums;
    }
}