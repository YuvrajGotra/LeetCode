class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return ;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = null;

        flatten(left);
        flatten(right);

        root.right = left;

        TreeNode temp = left;

        if(left != null) {
            while(temp.right != null) {
                temp = temp.right;
            }
            temp.right = right;
        }
        else {
            root.right = right;
        }
    }
}