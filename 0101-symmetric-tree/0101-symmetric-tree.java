class Solution {
    public boolean fun(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        return fun(p.left, q.right) && fun(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return fun(root.left, root.right);
    }
}