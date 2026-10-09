class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int i = 0, j = 0;
        int sum = 0;
        int cnt = 0;

        while(j != n) {
            sum += arr[j];

            if(j-i+1 == k) {
                int t = sum / k;
                if(t >= threshold) cnt++;
                while(j-i+1 >= k) {
                    sum -= arr[i];
                    i++;
                }
            }

            j++;
        }

        return cnt;
    }
}