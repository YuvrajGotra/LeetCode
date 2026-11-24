class Solution {
    public List<Integer> grayCode(int n) {
        int[] arr = new int[n];
        List<Integer> res = new ArrayList<>();
        helper(arr, 0, res, false);
        return res;
    }

    public void helper(int[] arr, int idx, List<Integer> res, boolean r) {
        if(idx == arr.length) {
            res.add(fun(arr));
            return ;
        }

        arr[idx] = r ? 1 : 0;
        helper(arr, idx+1, res, false);

        arr[idx] = r ? 0 : 1;
        helper(arr, idx+1, res, true);
    }

    public int fun(int[] arr) {
        int sum = 0;
        int t = 1;

        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == 1) {
                sum += t;
            }
            t *= 2;
        }

        return sum;
    }
}