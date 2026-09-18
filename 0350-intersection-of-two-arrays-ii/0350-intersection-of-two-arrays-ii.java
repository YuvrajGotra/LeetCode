class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int ele: nums1) map.put(ele, map.getOrDefault(ele, 0)+1);


        for(int ele: nums2) {
            if(map.containsKey(ele)) {
                arr.add(ele);
                map.put(ele, map.get(ele)-1);

                if(map.get(ele) == 0) {
                    map.remove(ele);
                }
            }
        }

        int[] res = new int[arr.size()];
        int idx = 0;

        for(int ele: arr) {
            res[idx] = ele;
            idx++;
        }

        return res;
    }
}