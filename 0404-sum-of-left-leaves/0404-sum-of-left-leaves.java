class Solution {
    int sum;

    public void helper(TreeNode root, boolean isLeft) {
        if(root == null) return ;
        if(root.left == null && root.right == null) {
            if(isLeft) {
                sum += root.val;
            }
            return ;
        }
        helper(root.left, true);
        helper(root.right, false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        helper(root, false);
        return sum;
    }
}