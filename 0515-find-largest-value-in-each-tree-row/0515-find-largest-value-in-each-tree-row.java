class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public void helper(TreeNode root, List<Integer> list) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while( q.size() != 0 ) {
            int size = q.size();
            Pair front = null;
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < size; i++) {
                front = q.remove();
                if(max < front.node.val) max = front.node.val;

                if( front.node.left != null ) q.add( new Pair( front.node.left, front.level+1 ) );
                if( front.node.right != null ) q.add( new Pair( front.node.right, front.level+1 ) );
            }

            list.add(max);
        }
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        helper(root, list);
        return list;
    }
}