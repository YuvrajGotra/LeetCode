class Solution {
    public int rob(int[] nums) {
        int money1 = 0;
        int money2 = 0;

        for(int i = 0; i < nums.length; i++) {
            int temp = money1;

            money1 = Math.max(money1, money2+nums[i]);

            money2 = temp;
        }

        return money1;
    }
}