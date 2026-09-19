class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ele: t.toCharArray()) map.put(ele, map.getOrDefault(ele, 0)+1);

        for(char ele: s.toCharArray()) {
            if(map.containsKey(ele)) {
                map.put(ele, map.get(ele)-1);
            }

            if(map.get(ele) == 0) {
                map.remove(ele);
            }
        }

        char res = '\0';

        for(char ele: map.keySet()) {
            if(map.get(ele) == 1) res = ele;
        }

        return res;
    }
}