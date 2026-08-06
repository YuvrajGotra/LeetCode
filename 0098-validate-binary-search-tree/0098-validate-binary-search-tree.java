class Pair {
    long max;
    long min;
    Pair(long max, long min) {
        this.max = max;
        this.min = min;
    }
}

class Solution {
    public boolean flag;

    public Pair maxMin(TreeNode root) {
        if (root == null) return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
        Pair lst = maxMin(root.left);
        Pair rst = maxMin(root.right);
        if(lst.max >= root.val || rst.min <= root.val) flag = false;
        long mx = Math.max((long)root.val, Math.max(lst.max, rst.max));
        long mi = Math.min((long)root.val, Math.min(lst.min, rst.min));
        return new Pair(mx, mi);
    }

    public boolean isValidBST(TreeNode root) {
        flag = true;
        maxMin(root);
        return flag;
    }
}