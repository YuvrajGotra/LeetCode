class Solution {
    public int findHeightParent(TreeNode root, int[] parent, int value, int height) {
        if(root == null) return 0;
        if(root.val == value) return height;

        parent[0] = root.val;
        int left = findHeightParent(root.left, parent, value, height+1);

        if(left != 0) return left;

        parent[0] = root.val;
        int right = findHeightParent(root.right, parent, value, height+1);

        return right;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val == x || root.val == y) return false;

        int[] xParent = {-1};
        int xHeight = findHeightParent(root, xParent, x, 0);

        int[] yParent = {-1};
        int yHeight = findHeightParent(root, yParent, y, 0);

        return xParent[0] != yParent[0] && xHeight == yHeight;
    }
}