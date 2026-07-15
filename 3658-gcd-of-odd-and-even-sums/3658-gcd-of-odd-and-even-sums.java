class Solution {
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        int cnt = 0;
        int i = 1;
        while(cnt != n) {
            if(i % 2 != 0) {
                sumOdd += i;
                cnt++;
            }
            i++;
        }

        cnt = 0;
        i = 1;
        while(cnt != n) {
            if(i % 2 == 0) {
                sumEven += i;
                cnt++;
            }
            i++;
        }

        return gcd(sumOdd, sumEven);
    }
}