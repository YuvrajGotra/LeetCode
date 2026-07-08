class Solution {
    public long sumAndMultiply(int n) {
        int a = n;
        int sum = 0;
        long r1 = 0;
        long r2=0;

        while(a != 0) {
            sum = sum + a%10;
            a = a/10;
        }
        a=n;
        while(a!=0){
            int digit=a%10;
            if(digit != 0){
                r1=r1*10+digit;
            }
            a=a/10;
        }

        while(r1!=0){
            int digit=(int)r1%10;
            if(digit != 0){
                r2=r2*10+digit;
            }
            r1=r1/10;
        }
        

        return r2*sum;


    }
}