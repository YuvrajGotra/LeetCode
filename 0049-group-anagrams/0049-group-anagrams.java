class Pair {
    int len;
    int idx;

    Pair(int len, int idx) {
        this.len = len;
        this.idx = idx;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        
        Map<String, Pair> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            String key = fun(s);
            

            if(map.containsKey(key)) {
                int idx = map.get(key).idx;
                res.get(idx).add(s);
            } else {
                int idx = res.size();

                List<String> temp = new ArrayList<>();
                temp.add(s);
                res.add(temp);

                map.put(key, new Pair(s.length(), idx));
            }
        }

        return res;
    }

    public String fun(String s) {
        int[] freq = new int[26];

        for(char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }

        return Arrays.toString(freq);
    }
}