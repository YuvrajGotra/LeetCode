class Pair {
    int level;
    TreeNode node;
    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public void helper(TreeNode root, List<List<Integer>> arr) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        List<Integer> list = new ArrayList<>();
        int currLevel = 0;

        while(q.size() != 0) {
            Pair front = q.remove();
            if(currLevel != front.level) {
                arr.add(new ArrayList<>(list));
                list.clear();
                currLevel++;
            }
            list.add(front.node.val);
            if(front.node.left != null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right, front.level+1));
        }
        arr.add(list);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;

        helper(root, list);

        Collections.reverse(list);
        return list;
    }
}