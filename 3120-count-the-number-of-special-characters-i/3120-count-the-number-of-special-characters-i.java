class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;

        for(char ch: word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.print(map);

        for(char ch: word.toCharArray()) {
            if(Character.isLowerCase(ch) && map.containsKey(Character.toUpperCase(ch)) ) {
                map.remove(ch);
                map.remove(Character.toUpperCase(ch));
                res++;
            }
        }

        return res;
    }
}