class Solution {
    public void helper(TreeNode root, List<Integer> arr) {
        if(root == null) return ;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(q.size() != 0) {
            int size = q.size();
            
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                
                if(i == size-1) {
                    arr.add(curr.val);
                }

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        helper(root, list);

        return list;
    }
}