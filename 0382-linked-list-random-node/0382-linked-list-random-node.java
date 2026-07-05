class Solution {
    private List<Integer> values;
    private Random rand;

    public Solution(ListNode head) {
        values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        rand = new Random();
    }

    public int getRandom() {
        return values.get(rand.nextInt(values.size()));
    }
}