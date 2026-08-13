class Solution {
    int m;
    public int maxPathSum(TreeNode root) {
        m = Integer.MIN_VALUE;
        maxSum(root);
        return m;
        
    }
    public int maxSum(TreeNode root) {
        if(root == null) return 0;
        int l = Math.max(0, maxSum(root.left));
        int r = Math.max(0, maxSum(root.right));
        m = Math.max(m, l+r+root.val);
        return Math.max(l, r)+root.val;
    }
}