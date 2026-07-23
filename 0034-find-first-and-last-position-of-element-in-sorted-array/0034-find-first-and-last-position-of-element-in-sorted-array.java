class Solution {
    public int[] searchRange(int[] arr, int target) {
        int left = left(arr, target);
        int right = right(arr, target);
        
        return new int[] {left, right};
    }
    public int left(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(arr[mid] > target) {
                e = mid - 1;
            }
            else if(arr[mid] < target) {
                s = mid + 1;
            }
            else {
                ans = mid;
                e = mid - 1;
            }
        }

        return ans;
    }
    public int right(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(arr[mid] > target) {
                e = mid - 1;
            }
            else if(arr[mid] < target) {
                s = mid + 1;
            }
            else {
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }
}