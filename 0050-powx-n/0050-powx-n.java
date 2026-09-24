class Solution {
    public double myPow(double x, int n) {
        if(x == 1.00000) return x;

        long num = n;
        double sum = 1;

        if(num < 0) {
            x = 1/x;
            num = -num;
        }

        while(num > 0) {
            if(num % 2 == 1) {
                sum *= x;
            }
            x *= x;
            num /= 2;
        }

        return sum;
    }
}