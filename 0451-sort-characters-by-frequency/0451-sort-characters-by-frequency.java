class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0)+1);

        PriorityQueue<Character> pq = new PriorityQueue<>
        ((a,b) -> map.get(b) - map.get(a));

        for(char ch: map.keySet()) {
            pq.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        while(pq.size() > 0) {
            char ch = pq.remove();

            int freq = map.get(ch);

            while(freq != 0) {
                sb.append(ch);
                freq--;
            }
        }

        return sb.toString();
    }
}