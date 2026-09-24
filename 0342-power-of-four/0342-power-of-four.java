class Solution {
    public boolean isPower(int n) {
        return (n & (n-1)) == 0;
    }

    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;
        int x = (int) Math.sqrt(n);
        return isPower(n) && (x*x)==n;
    }
}