class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;

        if(n == 0) return true;
        if(l == 1 && flowerbed[0] == 0) return true;
        if(l == 1 && flowerbed[0] == 1) return false;

        for(int i = 0; i < l; i++) {
            if(n == 0) return true;
            if(flowerbed[i] == 0) {
                if(i == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
                else if(i == l-1 && flowerbed[i-1] == 0) {
                    flowerbed[i-1] = 1;
                    n--;
                }
                else if(i-1 >= 0 && i+1 < l && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n == 0;
    }
}