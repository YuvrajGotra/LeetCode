class Triplet implements Comparable<Triplet> {
    TreeNode node;
    int row;
    int col;

    Triplet(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }

    public int compareTo(Triplet t) {
        if(this.col != t.col) return this.col - t.col;
        if(this.row != t.row) return this.row - t.row;
        return this.node.val - t.node.val;
    }
}

class Solution {
    public void helper(TreeNode root, List<List<Integer>> list) {
        Queue<Triplet> q = new LinkedList<>();
        q.add(new Triplet(root, 0, 0));
        List<Triplet> arr = new ArrayList<>();

        while(q.size() != 0) {
            Triplet front = q.remove();

            arr.add(front);

            if(front.node.left != null) q.add(new Triplet(front.node.left, front.row+1, front.col-1));
            if(front.node.right != null) q.add(new Triplet(front.node.right, front.row+1, front.col+1));
        }

        Collections.sort(arr);
        int prevCol = Integer.MIN_VALUE;

        for(Triplet t : arr) {
            if(t.col != prevCol) {
                list.add(new ArrayList<>());
                prevCol = t.col;
            }
            list.get(list.size()-1).add(t.node.val);
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
}