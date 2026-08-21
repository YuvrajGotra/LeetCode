class Solution {
    public int level(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int level = level(root.left) + level(root.right);
        int dia1 = diameterOfBinaryTree(root.left);
        int dia2 = diameterOfBinaryTree(root.right);

        return Math.max(level, Math.max(dia1, dia2));
    }
}