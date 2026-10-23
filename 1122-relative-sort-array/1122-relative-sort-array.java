class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele: arr1) map.put(ele, map.getOrDefault(ele, 0)+1);

        int[] res = new int[arr1.length];
        int cnt = 0;

        for(int ele: arr2) {
            int t = map.get(ele);

            while(t != 0) {
                res[cnt++] = ele;
                t--;
            }

            map.remove(ele);
        }

        List<Integer> rem = new ArrayList<>(map.keySet());
        Collections.sort(rem);

        for(int ele: rem) {
            int t = map.get(ele);

            while(t-- > 0) {
                res[cnt++] = ele;
            }
        }

        return res;
    }
}