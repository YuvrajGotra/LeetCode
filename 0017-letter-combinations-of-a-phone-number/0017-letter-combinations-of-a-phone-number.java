class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits.length() == 0) return result;

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        StringBuilder sb = new StringBuilder();

        gernate(digits, 0, map, sb, result);

        return result;
    }

    public void gernate(String digits, int idx, String[] map, StringBuilder sb, List<String> res) {
        if(idx == digits.length()) {
            res.add(sb.toString());
            return ;
        }

        String t1 = map[digits.charAt(idx)-'0'];
        
        for(char ch: t1.toCharArray()) {
            sb.append(ch);
            gernate(digits, idx+1, map, sb, res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}