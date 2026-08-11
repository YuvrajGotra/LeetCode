class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int f : map.keySet()) {
            if( map.get(f)==f){
                res.add(f) ;
            }
        }

        return res.size() == 0 ? -1 : Collections.max(res);
    }
}