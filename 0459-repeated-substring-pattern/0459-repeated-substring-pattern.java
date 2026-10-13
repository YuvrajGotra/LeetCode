class Solution {
    public int[] buildLPS(String s) {
        int m = s.length();

        int[] lps = new int[m];

        int i = 1;
        int cnt = 0;

        while(i < m) {
            if(s.charAt(i) == s.charAt(cnt)) {
                cnt++;
                lps[i] = cnt;
                i++;
            }
            else {
                if(cnt > 0) {
                    cnt = lps[cnt-1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        if(n < 2) return false;

        int[] lps = buildLPS(s);

        int longestPrefixSuffix = lps[n-1];
        int patternLength = n - longestPrefixSuffix;

        return longestPrefixSuffix > 0 && n % patternLength == 0;
    }
}