class Solution {
    public boolean detectCapitalUse(String word) {
        int l = 0;
        int u = 0;
        int n = word.length();

        for(char ch: word.toCharArray()) {
            int a = ch - 'a';

            if(a >= 0 && a <= 26) l++;
            else u++;
        }

        if(l == n || u == n) return true;
        if(Character.isUpperCase(word.charAt(0)) && l == n-1) return true;
        return false;
    }
}