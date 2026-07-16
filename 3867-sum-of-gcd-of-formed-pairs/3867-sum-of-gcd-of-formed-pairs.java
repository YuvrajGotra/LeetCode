class Solution {
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = a;
            a = b;
            b = temp % a;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] mxi = new int[n];
        int max = Integer.MIN_VALUE;
        int a = 0;

        int[] prefixGcd = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
            mxi[i] = max;
        }

        for(int i = 0; i < n; i++) {
            prefixGcd[i] = gcd(nums[i], mxi[i]);
        }

        Arrays.sort(prefixGcd);
        long sum = 0;

        for(int i = 0, j = n-1; i < j; i++, j--) {
            sum += gcd(prefixGcd[i], prefixGcd[j]);
        }
        return sum;
        
    }
}