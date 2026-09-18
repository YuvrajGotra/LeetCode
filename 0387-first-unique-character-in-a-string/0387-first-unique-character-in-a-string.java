class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int idx = 0;
        for(char ch: s.toCharArray()) {
            if(map.get(ch) == 1) {
                return idx;
            }

            idx++;
        }

        return -1;
    }
}