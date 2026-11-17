class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(s, res, 0, sb);
        return res;
    }

    public void helper(String s, List<String> res, int idx, StringBuilder sb) {
        if(s.length() == sb.length()) {
            res.add(sb.toString());
            return ;
        }
        
        char ch = s.charAt(idx);

        if(Character.isDigit(ch)) {
            sb.append(ch);
            helper(s, res, idx+1, sb);
            sb.deleteCharAt(sb.length()-1);
        } else {
            sb.append(Character.toLowerCase(ch));
            helper(s, res, idx+1, sb);
            sb.deleteCharAt(sb.length()-1);

            sb.append(Character.toUpperCase(ch));
            helper(s, res, idx+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}