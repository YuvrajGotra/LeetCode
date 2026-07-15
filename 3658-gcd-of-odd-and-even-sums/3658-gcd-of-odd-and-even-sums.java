class Solution {
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        int cnt = 0;
        int i = 1;
        while(cnt != (n+n)) {
            if(i % 2 != 0) {
                sumOdd += i;
            }else {
                sumEven += i;
            }
            i++;
            cnt++;
        }

        return gcd(sumOdd, sumEven);
    }
}