class Solution {
    public ListNode sortList(ListNode head) {
        int size = size(head);
        int[] t = new int[size];

        ListNode temp = head;
        int idx = 0;
        while(temp != null) {
            t[idx++] = temp.val;
            temp = temp.next;
        }

        mergeSort(t, 0, size-1);

        idx = 0;
        temp = head;
        while(temp != null) {
            temp.val = t[idx++];
            temp = temp.next;
        }

        return head;
    }

    public int size(ListNode head) {
        ListNode t = head;
        int size = 0;

        while(t != null) {
            t = t.next;
            size++;
        }

        return size;
    }

    public void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return ;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];

        int i = low;
        int j = mid+1;
        int idx = 0;

        while(i <= mid && j <= high) {
            if(arr[i] <= arr[j]) {
                temp[idx++] = arr[i++];
            } else {
                temp[idx++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[idx++] = arr[i++];
        }

        while(j <= high) {
            temp[idx++] = arr[j++];
        }

        for(int k = 0; k < temp.length; k++) {
            arr[low+k] = temp[k];
        }
    }
}