class Solution {
    public String greatestLetter(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;

        for(char ch = 'Z'; ch >= 'A'; ch--) {
            if(map.containsKey(ch) && map.containsKey(Character.toLowerCase(ch))) {
                return String.valueOf(ch);
            }
        }

        return "";
    }
}