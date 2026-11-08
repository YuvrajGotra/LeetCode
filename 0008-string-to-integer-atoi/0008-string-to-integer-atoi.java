class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;

        long res = 0;
        boolean neg = false;
        boolean nlz = false;

        if(s.charAt(0) == '-') neg = true;

        for(int i = neg == true ? 1 : 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '+') continue;
            if(s.charAt(i) == '0' && !nlz) continue;
            if(!Character.isDigit(s.charAt(i))) break;

            nlz = true;
            int digit = s.charAt(i) - '0';

            long limit = neg ? 2147483648L : 2147483647L;

            if(res > limit / 10 || 
            (res == limit / 10 && digit > limit % 10)) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + digit;
        }


        if(neg) res *= -1;

        return (int)res;
    }
}