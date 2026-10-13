class Solution {
    public int[] buildLPS(String s) {
        int m = s.length();

        int[] lps = new int[m];

        int cnt = 0;
        int i = 1;

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

    public boolean searchKMP(String a, String b, int[] lps) {
        int m = a.length();
        int n = b.length();

        int i = 0;
        int j = 0;

        while(i < m) {
            if(a.charAt(i) == b.charAt(j)) {
                i++;
                j++;

                if(j == n) {
                    return true;
                }
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

    public int repeatedStringMatch(String a, String b) {
        int m = a.length();
        int n = b.length();

        int[] lps = buildLPS(b);

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;
        int cnt = 0;

        while(sb.length() < n) {
            sb.append(a);
            cnt++;
        }

        String text = sb.toString();

        if(searchKMP(text, b, lps)) {
            return cnt;
        }

        text += a;
        cnt++;

        if(searchKMP(text, b, lps)) {
            return cnt;
        }

        return -1;
    }
}