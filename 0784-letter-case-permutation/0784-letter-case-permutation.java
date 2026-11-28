class Solution {
    public void helper(String s, List<String> res, int idx, StringBuilder sb) {
        if(s.length() == sb.length()) {
            res.add(sb.toString());
            return ;
        }


        if(Character.isDigit(s.charAt(idx))) {
            sb.append(s.charAt(idx));
            helper(s, res, idx+1, sb);
            sb.deleteCharAt(sb.length()-1);
            return ;
        }

        sb.append(Character.toLowerCase(s.charAt(idx)));
        helper(s, res, idx+1, sb);
        sb.deleteCharAt(sb.length()-1);

        sb.append(Character.toUpperCase(s.charAt(idx)));
        helper(s, res, idx+1, sb);
        sb.deleteCharAt(sb.length()-1);
    }

    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        helper(s, res, 0, sb);

        return res;
    }
}