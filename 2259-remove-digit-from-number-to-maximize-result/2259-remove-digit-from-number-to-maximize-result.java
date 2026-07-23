class Solution {
    public String check(String str, int idx) {
        String s = "";

        for(int i = 0; i < str.length(); i++) {
            if(i == idx) continue;
            else s += str.charAt(i);
        }

        return s;
    }
    public String removeDigit(String number, char digit) {
        ArrayList<String> res = new ArrayList<>();

        for(int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if(ch == digit) {
                res.add(check(number, i));
            }
        }

        return Collections.max(res);
    }
}