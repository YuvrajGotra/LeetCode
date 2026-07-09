class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;

        int idx = 0;
        for(int i = 0; i < t.length(); i++) {
            char ch1 = t.charAt(i);

            if(idx >= s.length()) return true;

            char ch2 = s.charAt(idx);

            if(ch1 == ch2) idx++;

        }

        if(idx == s.length()) return true;
        return false;
    }
}