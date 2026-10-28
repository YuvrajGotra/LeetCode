class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;

        int s = 0;
        int e = num/2;

        while(s <= e) {
            int mid = s + (e - s) / 2;

            long sq = (long) mid*mid;
            
            if(sq > num) {
                e = mid-1;
            } else if(sq < num) {
                s = mid+1;
            } else {
                return true;
            }
        }

        return false;
    }
}