class Solution {
    public int countGoodSubstrings(String s) {
        Set<Character> set = new HashSet<>();

        int i = 0, j = 0;
        int n = s.length();
        int cnt = 0;

        while(j < n) {
            char ch = s.charAt(j);

            while(set.contains(ch)) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(ch);

            while(j-i+1 == 3) {
                cnt++;
                set.remove(s.charAt(i));
                i++;
            }

            j++;
        }

        return cnt;
    }
}