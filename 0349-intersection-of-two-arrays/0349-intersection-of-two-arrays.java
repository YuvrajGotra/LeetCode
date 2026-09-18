class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int ele: nums1) map.put(ele, map.getOrDefault(ele, 0)+1);

        for(int ele: nums2) {
            if(map.containsKey(ele)) {
                set.add(ele);
                map.put(ele, map.get(ele)-1);
                
                if(map.get(ele) == 0) map.remove(ele);
            }
        }

        int[] res = new int[set.size()];
        int idx = 0;

        for(int ele: set) {
            res[idx] = ele;
            idx++;
        }

        return res;
    }
}