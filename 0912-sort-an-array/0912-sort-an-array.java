class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length-1;

        mergeSort(nums, 0, n);

        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {
        if(low >= high) return ;

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);

        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high-low+1];

        int i = low;
        int j = mid+1;
        int idx = 0;

        while(i <= mid && j <= high) {
            if(nums[i] <= nums[j]) {
                temp[idx++] = nums[i++];
            }
            else {
                temp[idx++] = nums[j++];
            }
        }

        while(i <= mid) {
            temp[idx++] = nums[i++];
        }

        while(j <= high) {
            temp[idx++] = nums[j++];
        }

        for(int k = 0; k < temp.length; k++) {
            nums[low+k] = temp[k];
        }
    }
}