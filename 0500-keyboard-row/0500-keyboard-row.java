class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> t = new ArrayList<>();

        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        for(int i = 0; i < words.length; i++) {
            String str = words[i];
            str = str.toLowerCase();
            boolean a = false;

            String row;

            if(s1.indexOf(str.charAt(0)) != -1) {
                row = s1;
            }
            else if(s2.indexOf(str.charAt(0)) != -1) {
                row = s2;
            }
            else {
                row = s3;
            }

            for(int j = 0; j < str.length(); j++) {
                if(row.indexOf(str.charAt(j)) == -1) {
                    a = true;
                }
            }

            if(!a) t.add(words[i]);
        }

        String[] res = new String[t.size()];
        int idx = 0;

        for(String ele: t) {
            res[idx++] = ele;
        }

        return res;
    }
}