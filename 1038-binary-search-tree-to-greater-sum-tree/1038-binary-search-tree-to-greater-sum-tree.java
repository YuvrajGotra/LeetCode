/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int sum;
    public void revInorder(TreeNode root) {
        if(root == null) return ;

        revInorder(root.right);
        int val = root.val;
        sum += val;
        root.val = sum;
        revInorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        revInorder(root);
        return root;
    }
}