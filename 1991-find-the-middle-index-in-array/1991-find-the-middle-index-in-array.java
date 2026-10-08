class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0;

        for(int ele: nums) total += ele;

        int leftSum = 0;
        int idx = 0;

        for(int ele: nums) {
            int rightSum = total - leftSum - ele;

            if(leftSum == rightSum) {
                return idx;
            }

            leftSum += ele;
            idx++;
        }

        return -1;
    }
}