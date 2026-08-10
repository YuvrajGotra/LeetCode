class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;

        for(int i = 0; i < details.length; i++) {
            char[] ch = details[i].toCharArray();
            String s = "";
            s += ch[11];
            s += ch[12];
            int z = 0 ; 
            for(int j = 0 ; j < s.length() ;j++) z = (z*10) + s.charAt(j)-'0';
           if(z>60) cnt++;
        }

        return cnt;
    }
}