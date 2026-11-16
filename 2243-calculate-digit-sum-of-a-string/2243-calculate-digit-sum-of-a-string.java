class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            StringBuilder res = new StringBuilder();

            int sum = 0;
            int count = 0;

            for (int i = 0; i < s.length(); i++) {

                sum += s.charAt(i) - '0';
                count++;

                if (count == k) {
                    res.append(sum);
                    sum = 0;
                    count = 0;
                }
            }

            // Handle the remaining group
            if (count > 0) {
                res.append(sum);
            }

            s = res.toString();
        }

        return s;
    }
}