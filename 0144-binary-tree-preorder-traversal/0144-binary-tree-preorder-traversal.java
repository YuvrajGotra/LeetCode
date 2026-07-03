class Solution {
    public void fun(TreeNode root, List<Integer> list) {
        if(root == null) return ;
        
        list.add(root.val);

        fun(root.left, list);
        fun(root.right, list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        fun(root, list);

        return list;        
    }
}