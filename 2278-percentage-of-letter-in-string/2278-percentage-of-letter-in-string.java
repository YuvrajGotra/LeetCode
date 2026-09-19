class Solution {
    public static int a;
    public int percentageLetter(String s, char letter) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0)+1);

        if(map.containsKey(letter)) {
            a = map.get(letter);
        }
        else {
            return 0;
        }

        int res = (a*100) / s.length();
        
        return res;
    }
}