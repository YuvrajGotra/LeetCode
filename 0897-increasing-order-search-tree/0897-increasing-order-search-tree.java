class Solution {
    TreeNode curr;

    public void helper(TreeNode root) {
        if(root == null) return ;

        helper(root.left);

        curr.right = new TreeNode(root.val);
        curr = curr.right;

        helper(root.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode(-1);
        curr = newRoot;
        helper(root);
        return newRoot.right;
    }
}