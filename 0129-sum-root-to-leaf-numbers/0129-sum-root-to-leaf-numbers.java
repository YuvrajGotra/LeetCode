class Solution {
    public int sum;

    public void helper(TreeNode root, int digit) {
        if(root == null) return ;

        digit = digit * 10 + root.val;

        if(root.left == null && root.right == null) {
            sum += digit;
            return ;
        }

        helper(root.left, digit);
        helper(root.right, digit);
    }

    public int sumNumbers(TreeNode root) {
        sum = 0;
        helper(root, 0);
        return sum;
    }
}