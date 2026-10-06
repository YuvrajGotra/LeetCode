class Triple {
    int num;
    String str;
    int idx;

    Triple(int num, String str, int idx) {
        this.num = num;
        this.str = str;
        this.idx = idx;
    }
}

class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Triple> pq = new PriorityQueue<>
        ((a, b) -> b.num - a.num);

        int r = 1;
        for(int i = 0; i < score.length; i++) {
            String str = "";
            if(r == 1) {
                str += "Gold Medal";
                pq.add(new Triple(score[i], str, i));
            }
            else if(r == 2) {
                str += "Silver Medal";
                pq.add(new Triple(score[i], str, i));  
            }
            else if(r == 3) {
                str += "Bronze Medal";
                pq.add(new Triple(score[i], str, i));  
            }
            else {
                str += r;
                pq.add(new Triple(score[i], str, i));
            }
            r++;
        }

        String[] s = new String[score.length];
        r = 1;

        while(pq.size() > 0) {
            Triple t = pq.remove();
            int idx = t.idx;

            if(r == 1) t.str = "Gold Medal";
            else if(r == 2) t.str = "Silver Medal";
            else if(r == 3) t.str = "Bronze Medal";
            else t.str = String.valueOf(r);

            s[idx] = t.str;
            r++;
        }

        return s;
    }
}