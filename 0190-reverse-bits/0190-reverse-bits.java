class Solution {
    public int reverseBits(int n) {
        long t = n;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 32; i++) {
            sb.append(t&1);
            t >>>= 1;
        }

        long sum = 0;
        long temp = 1;

        for(int i = 0; i < 32; i++) {
            long val = sb.charAt(31-i) - '0';

            sum += temp*val;
            temp *= 2;
        }

        return (int)sum;
    }
}