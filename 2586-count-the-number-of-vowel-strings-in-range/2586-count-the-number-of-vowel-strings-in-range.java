class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt = 0;
        for(int i = left; i <= right; i++) {
            if(i >= left && i <= right) {
                String str = words[i];

                char a = str.charAt(0);
                char b = str.charAt(str.length()-1);
                
                if( ((a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') && (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u')) 
                || ((a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') &&  (b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U')) ) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}