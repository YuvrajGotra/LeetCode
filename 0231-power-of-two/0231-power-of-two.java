class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;

        long power = 2;

        while(power <= n) {
            if(power == n) return true;
            power = power << 1;
        }

        return false;
    }
}