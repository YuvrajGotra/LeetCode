class Solution {
    public void helper(TreeNode root, int sum, List<Integer> path, List<List<Integer>> list) {
        if(root == null) return ;

        List<Integer> newPath = new ArrayList<>(path);
        newPath.add(root.val);

        if(root.left == null && root.right == null) {
            if(sum == root.val) {
                list.add(newPath);
                return ;
            }
        }

        helper(root.left, sum - root.val, newPath, list);
        helper(root.right, sum - root.val, newPath, list);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        helper(root, targetSum, path, list);

        return list;
    }
}