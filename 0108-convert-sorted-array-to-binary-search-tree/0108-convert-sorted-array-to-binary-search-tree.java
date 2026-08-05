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
    public TreeNode helper(int s, int e, int[] nums) {
        if(s > e) return null;
        int mid = s + (e - s) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(s, mid-1, nums);
        root.right = helper(mid+1, e, nums);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return helper(0, n-1, nums);
    }
}