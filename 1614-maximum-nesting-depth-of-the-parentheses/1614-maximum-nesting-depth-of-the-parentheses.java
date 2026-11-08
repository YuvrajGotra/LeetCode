class Solution {
    public int maxDepth(String s) {
        int l = s.length();
        int maxCnt = 0;
        int cnt = 0;

        for(int i = 0; i < l; i++) {
            if(s.charAt(i) == '(') {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);

            } else if(s.charAt(i) == ')') {
                cnt--;
            }
        }

        return maxCnt;
    }
}