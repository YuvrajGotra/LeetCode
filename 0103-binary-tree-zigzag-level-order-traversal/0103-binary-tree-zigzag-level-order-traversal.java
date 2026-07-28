class Pair {
    TreeNode node;
    int level;
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
        int currLvl = 0;

        while(q.size() != 0) {
            Pair front = q.remove();

            if(currLvl != front.level) {
                if(currLvl % 2 == 1)
                    Collections.reverse(list);

                arr.add(new ArrayList<>(list));
                list.clear();
                currLvl++;
            }

            list.add(front.node.val);

            if(front.node.left != null) q.add(new Pair(front.node.left, front.level + 1));
            if(front.node.right != null) q.add(new Pair(front.node.right, front.level + 1));
        }
        if(currLvl % 2 == 1)
            Collections.reverse(list);

        arr.add(new ArrayList<>(list));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;

        helper(root, list);

        return list;
    }
}