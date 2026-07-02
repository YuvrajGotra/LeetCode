class Solution {
    public boolean checkTree(TreeNode root) {

        int a = root.left.val;
        int b = root.right.val;
        if(root.val == a + b) return true;
        return false;
    }
}