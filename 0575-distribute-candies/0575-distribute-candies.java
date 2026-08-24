class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;

        for(int ele : candyType) {
            if(l == candyType.length/2) break;
            if(set.contains(ele)) continue;
            set.add(ele);
            l++;
        }

        return set.size();
    }
}