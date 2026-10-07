class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length, n = s.length;
        int l = 0, r = 0;

        Arrays.sort(g);
        Arrays.sort(s);
        int cnt = 0;

        while(l < m && r < n) {
            if(s[r] >= g[l]) {
                l++;
                r++;
            }
            else if(s[r] < g[l]) {
                r++;
            }
        }

        return l;
    }
}