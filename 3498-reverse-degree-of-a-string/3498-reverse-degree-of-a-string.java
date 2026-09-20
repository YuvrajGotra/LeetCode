class Solution {
    static int idx;
    public int reverseDegree(String s) {
        int sum = 0;
        int i = 0;
        idx = 1;

        while(i != s.length()) {
            char ch = s.charAt(i);

            int val = ('z' - ch)+1;
            sum += val*idx;
        
            idx++;
            i++;
        }
        

        return sum;
    }
}