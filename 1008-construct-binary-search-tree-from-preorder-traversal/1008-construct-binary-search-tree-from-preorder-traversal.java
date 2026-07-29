class Solution {
    public TreeNode build(int preLo, int preHi, int[] preorder) {
        if(preLo > preHi) return null;
        int val = preorder[preLo];
        TreeNode root = new TreeNode(val);
        int split = preLo + 1;

        while (split <= preHi && preorder[split] < root.val) {
            split++;
        }

        root.left = build(preLo+1, split-1, preorder);
        root.right = build(split, preHi, preorder);
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        return build(0, n-1, preorder);
    }
}