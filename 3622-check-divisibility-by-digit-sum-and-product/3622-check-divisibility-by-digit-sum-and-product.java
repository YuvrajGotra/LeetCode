class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int sum = 0;
        int product = 1;

        while(a != 0) {
            int digit = a % 10;
            sum += digit;
            product *= digit;
            a = a / 10;
        }

        return n % (sum + product) == 0;
    }
}