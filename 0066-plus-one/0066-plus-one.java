class Solution {
    public int[] plusOne(int[] digits) {
        boolean a = false;

        for(int i = digits.length-1; i >= 0; i--) {
            if(!a) {
                digits[i]+=1;
                a = true;
            }
            
            if(digits[i] >= 10) {
                digits[i] = digits[i] % 10;
                a = false;
            }
        }

        if(!a) {
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            
            for(int i = 1; i < ans.length; i++) {
                ans[i] = digits[i-1];
            }

            return ans;
        }

        return digits;
    }
}