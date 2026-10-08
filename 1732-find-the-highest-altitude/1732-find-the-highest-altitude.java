class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        
        int[] arr = new int[n+1];

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            sum += gain[i];
            arr[i+1] = sum;
        }

        for(int ele: arr) {
            max = Math.max(max, ele);
        }

        return max;
    }
}