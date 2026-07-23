class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int max = Integer.MIN_VALUE;

        while(s <= e) {
            int w = e - s;
            int h = Math.min(height[e], height[s]);
            int a = w * h;

            if(max <= a) max = a;
            if(h >= height[s]) s++;
            else e--;
        }

        return max;
    }
}