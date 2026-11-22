class Solution {
    public boolean checkString(String s) {
        boolean check = false;

        for(char ch: s.toCharArray()) {
            if(ch == 'b') check = true;
            if(check) {
                if(ch == 'a') return false;
            }
        }

        return true;
    }
}