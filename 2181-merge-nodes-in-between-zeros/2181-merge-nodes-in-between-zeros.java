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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode t = head;
        ListNode d = new ListNode(-1);
        ListNode tail = d;
        int sum = 0;
        int count = 0;

        while(t != null) {
            if(t.val == 0) {
                count++;
            }
            if(count == 2) {
                count = 1;
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }
            sum += t.val;
            t = t.next;
        }

        return d.next;
    }
}