class Solution {
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode d = new ListNode(-1);
        ListNode t = d;
        ListNode t1 = head1;
        ListNode t2 = head2;

        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                t.next = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t2 = t2.next;
            }
            t = t.next;
        }
        if(t1 == null){
            t.next = t2;
        }
        else{
            t.next = t1;
        }
        return d.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode n : lists) arr.add(n);
        while(arr.size() > 1){
            ListNode a = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            ListNode b = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            ListNode c = merge(a, b);
            arr.add(c);
        }
        return arr.get(0);
    }
}