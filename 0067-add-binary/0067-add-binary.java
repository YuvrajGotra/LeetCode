import java.math.BigInteger;

class Solution {
    public BigInteger num(String str) {
        BigInteger temp = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        BigInteger two = BigInteger.valueOf(2);

        for(int i = str.length()-1; i >= 0; i--) {
            BigInteger num = BigInteger.valueOf(str.charAt(i) - '0');
            sum = sum.add(num.multiply(temp));
            temp = temp.multiply(two);
        }

        return sum;
    }

    public String numTobi(BigInteger num) {
        if(num.equals(BigInteger.ZERO)) return "0";

        StringBuilder sb = new StringBuilder();
        BigInteger two = BigInteger.valueOf(2);

        while(!num.equals(BigInteger.ZERO)) {
            sb.append(num.mod(two));
            num = num.divide(two);
        }


        return sb.reverse().toString();
    }

    public String addBinary(String a, String b) {
        BigInteger sum = num(a).add(num(b));
        return numTobi(sum);
    }
}