class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> res = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[tiles.length()];

        helper(tiles, res, sb, used);

        return res.size();
    }

    public void helper(String str, Set<String> res, StringBuilder sb, boolean[] used) {
        for(int i = 0; i < str.length(); i++) {
            if(used[i]) continue;

            sb.append(str.charAt(i));
            used[i] = true;
            res.add(sb.toString());

            helper(str, res, sb, used);

            sb.deleteCharAt(sb.length()-1);
            used[i] = false;
        }
    }
}