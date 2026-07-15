/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair {
    TreeNode node;
    int level;
    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
 }
class Solution {
    public void helper(TreeNode root, List<List<Integer>> list) {
        if(root == null) return ;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int currentLevel = 0;
        List<Integer> temp = new ArrayList<>();

        while(q.size() > 0) {
            Pair front = q.remove();
            if(front.level != currentLevel) {
                currentLevel++;
                list.add(temp);
                temp = new ArrayList<>();
            }
            temp.add(front.node.val);
            if(front.node.left != null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right, front.level+1));

        }

        list.add(temp);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        helper(root, list);

        return list;
    }
}