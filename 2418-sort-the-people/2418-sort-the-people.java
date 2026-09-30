class Pair {
    String str;
    int val;

    Pair(String str, int val) {
        this.str = str;
        this.val = val;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Pair> pq = new PriorityQueue<>
        ((a, b) -> b.val - a.val);

        String[] res = new String[names.length];

        for(int i = 0; i < names.length; i++) {
            pq.add(new Pair(names[i], (int) heights[i]));
        }

        int idx = 0;
        while(pq.size() > 0) {
            Pair temp = pq.remove();
            res[idx++] = temp.str;
        }

        return res;
    }
}