class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i = 0, j = 0;
        int max = Integer.MIN_VALUE;
        int cnt = 0;

        while(j != n) {
            char ch = s.charAt(j);

            if(isVowel(ch)) {
                cnt++;
            }

            if(j-i+1 == k) {
                max = Math.max(max, cnt);
                
                if(isVowel(s.charAt(i))) cnt--;
                i++;
            }

            j++;
        }

        return max;
    }
    

    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }

        return false;
    }
}