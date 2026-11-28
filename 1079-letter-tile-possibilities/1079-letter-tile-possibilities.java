class Solution {
    public void helper(String s, boolean[] vis, ArrayList<String> res, StringBuilder sb) {
        if(sb.length() > 0) {
            res.add(sb.toString());
        }

        for(int i = 0; i < s.length(); i++) {
            if(vis[i]) continue;

            if(i > 0 && s.charAt(i) == s.charAt(i-1) && !vis[i-1]) continue;

            vis[i] = true;
            sb.append(s.charAt(i));
            helper(s, vis, res, sb);
            sb.deleteCharAt(sb.length()-1);
            vis[i] = false;
        }
    } 

    public int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        Arrays.sort(chars);

        boolean[] vis = new boolean[chars.length];
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        helper(new String(chars), vis, res, sb);

        System.out.println(res);

        return res.size();
    }
}