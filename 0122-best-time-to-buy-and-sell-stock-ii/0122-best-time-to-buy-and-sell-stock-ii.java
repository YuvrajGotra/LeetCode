class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = prices.length;
        
        int sum = 0;

        for(int i = 0; i < n; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }
            else if(max < prices[i]) {
                max = prices[i];

                if(i+1 == n || max >= prices[i+1]) {
                    sum += max - min;
                    min = Integer.MAX_VALUE;
                    max = Integer.MIN_VALUE;
                }    
            }
        }

        return sum;
    }
}