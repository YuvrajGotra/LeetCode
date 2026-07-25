class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int max = Integer.MIN_VALUE;

        while(i < j) {
            int h = j - i;
            int w = Math.min(height[i], height[j]);

            if(w == height[i]) i++;
            else j--;

            int a = h * w;

            if(max < a) max = a;
        }

        return max;
    }
}