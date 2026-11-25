class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();


        helper(s, res, temp, 0);


        return res;
    }

    public void helper(String s, List<List<String>> res, List<String> temp, int start) {
        if(start == s.length()) {
            res.add(new ArrayList<>(temp));
            return ;
        }

        for(int i = start; i < s.length(); i++) {
            if(isPlain(s, start, i)) {
                temp.add(s.substring(start, i+1));
                helper(s, res, temp, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    public boolean isPlain(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}