class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];

        int s1 = nums.length;
        int s2 = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(s2 == nums.length) {
                break;
            }
            sum += nums[i];
            arr.add(sum);
            s2++;
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        sum = 0;
        s2 = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            if(s2 == nums.length) {
                break;
            }
            sum+=nums[i];
            arr2.add(sum);
            s2++;
        }
        Collections.reverse(arr2);
        arr2.add(0);
        for(int i = 0; i < arr2.size(); i++) {
            res[i] = Math.abs(arr2.get(i) - arr.get(i));
        }


        
        return res;
        
    }
}