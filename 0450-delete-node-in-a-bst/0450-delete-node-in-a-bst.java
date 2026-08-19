class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        else {
            if(root.left == null && root.right == null) {
                return null;
            }
            if(root.left == null) {
                return root.right;
            }
            if(root.right == null) {
                return root.left;
            }
            TreeNode p = root.left;
            while(p.right != null) p = p.right;
            
            root.val = p.val;
            root.left = deleteNode(root.left, p.val);
        }

        return root;
    }
}