/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
class Solution {
    public int size(ListNode head) {
        ListNode temp = head;
        int cnt = 0;
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public TreeNode helper(int s, int e, ListNode head) {
        if(s > e) return null;
        int mid = s + (e - s) / 2;
        ListNode temp = head;
        int cnt = 0;
        while(cnt != mid) {
            temp = temp.next;
            cnt++;
        }
        TreeNode root = new TreeNode(temp.val);
        root.left = helper(s, mid-1, head);
        root.right = helper(mid+1, e, head);
        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        int size = size(head);
        return helper(0, size-1, head);
    }
}