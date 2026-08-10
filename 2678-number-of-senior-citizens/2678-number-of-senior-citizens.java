class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;

        for(int i = 0; i < details.length; i++) {
            char[] ch = details[i].toCharArray();
            String s = "";
            for(int j = 0; j < ch.length; j++) {
                if(j == 11 || j == 12) {
                    s += ch[j];
                }
            }
            if(Integer.parseInt(s) > 60) {
                cnt++;
            }
        }

        return cnt;
    }
}