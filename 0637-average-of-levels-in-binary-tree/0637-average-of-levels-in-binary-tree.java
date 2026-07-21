class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public void fun(TreeNode root, List<Double> list) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int level = 0;
        double sum = 0;
        int cnt = 0;    

        while(q.size() != 0) {
            Pair front = q.remove();

            if(front.level != level) {
                list.add(sum / cnt);

                level = front.level;
                sum = 0;
                cnt = 0;
            }

            sum += front.node.val;
            cnt++;

            if(front.node.left != null) q.add(new Pair(front.node.left, level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right, level+1));
        }

        list.add(sum / cnt);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        fun(root, list);

        return list;
    }
}