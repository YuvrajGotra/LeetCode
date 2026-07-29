class Solution {
    public TreeNode build(int inLo, int inHi, int postLo, int postHi, int[] inorder, int[] postorder) {
        if(inLo > inHi || postLo > postHi) return null;
        int val = postorder[postHi];
        int r = -1;
        TreeNode root = new TreeNode(val);

        for(int i = inLo; i <= inHi; i++) {
            if(inorder[i] == val) {
                r = i;
                break;
            }
        }
        int cnt = r - inLo;
        root.left = build(inLo, r-1, postLo, postLo+cnt-1, inorder, postorder);
        root.right = build(r+1, inHi, postLo+cnt, postHi-1, inorder, postorder);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0, n-1, 0, n-1, inorder, postorder);        
    }
}