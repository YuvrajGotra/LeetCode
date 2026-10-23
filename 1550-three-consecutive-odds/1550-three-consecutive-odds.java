class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddCnt = 0;

        for(int ele: arr) {
            if(oddCnt == 3) return true;
            if(ele % 2 == 1) {
                oddCnt++;
            } else {
                oddCnt = 0;
            }
        }

        return oddCnt == 3 ? true : false;
    }
}