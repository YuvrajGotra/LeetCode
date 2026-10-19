class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        mergeSort(nums, 0, nums.length-1);
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                res.add(i);
            }
        }

        return res;
    }

    public void mergeSort(int[] nums, int low, int high) {
        if(low >= high) return ;

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);

        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int[] t = new int[high-low+1];

        int i = low;
        int j = mid+1;
        int idx = 0;

        while(i <= mid && j <= high) {
            if(nums[i] <= nums[j]) {
                t[idx++] = nums[i++];
            } else {
                t[idx++] = nums[j++];
            }
        }

        while(i <= mid) {
            t[idx++] = nums[i++];
        }

        while(j <= high) {
            t[idx++] = nums[j++];
        }

        for(i = 0; i < t.length; i++) {
            nums[low+i] = t[i];
        }
    }
}