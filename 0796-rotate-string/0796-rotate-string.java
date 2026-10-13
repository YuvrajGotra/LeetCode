class Solution {
    public int[] buildLPS(String pattern) {
        int m = pattern.length();

        int[] lps = new int[m];

        int cnt = 0;
        int i = 1;

        while(i < m) {
            if(pattern.charAt(i) == pattern.charAt(cnt)) {
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

    public boolean rotateString(String s, String goal) {
        int m = s.length();
        int n = goal.length();

        if(m != n) return false;
        if(m == 0) return true;

        int[] lps = buildLPS(goal);

        String text = s+s;

        int i = 0;
        int j = 0;

        while(i < text.length()) {
            if(text.charAt(i) == goal.charAt(j)) {
                i++;
                j++;

                if(j == n) return true;
            }
            else {
                if(j > 0) {
                    j = lps[j-1];
                }
                else {
                    i++;
                }
            }
        }

        return false;
    }
}