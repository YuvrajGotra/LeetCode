class Quad {
    int max;
    int min;
    boolean isBST;
    int sum;

    Quad(int max, int min, boolean isBST, int sum) {
        this.max = max;
        this.min = min;
        this.isBST = isBST;
        this.sum = sum;
    }
}

class Solution {
    static int maxSum;

    public Quad helper(TreeNode root) {
        if(root == null) return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0);

        Quad lhs = helper(root.left);
        Quad rhs = helper(root.right);

        int max = Math.max(root.val, Math.max(lhs.max, rhs.max));
        int min = Math.min(root.val, Math.min(lhs.min, rhs.min));

        boolean isBST = lhs.isBST && rhs.isBST && (lhs.max < root.val) && (rhs.min > root.val);
        int sum = root.val + lhs.sum + rhs.sum;

        if(isBST) maxSum = Math.max(maxSum, sum);

        return new Quad(max, min, isBST, sum);
    }

    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);
        return maxSum;
    }
}