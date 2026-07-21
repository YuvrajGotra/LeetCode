class Solution {
    public void helper(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return ;
        arr.add(root.val);
        helper(root.left, arr);
        helper(root.right, arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr);
        Collections.sort(arr);
        return arr.get(k-1);
    }
}