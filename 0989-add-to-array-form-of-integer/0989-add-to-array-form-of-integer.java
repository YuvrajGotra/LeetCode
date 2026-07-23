class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();
        int carry = 0;

        for (int i = num.length - 1; i >= 0; i--) {
            int digit = k % 10;
            k /= 10;

            int sum = num[i] + digit + carry;
            arr.add(sum % 10);
            carry = sum / 10;
        }

        while (k > 0 || carry > 0) {
            int digit = k % 10;
            k /= 10;

            int sum = digit + carry;
            arr.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(arr);
        return arr;
    }
}