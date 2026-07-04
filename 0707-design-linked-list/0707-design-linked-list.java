class MyLinkedList {

    class Node {
        int val;
        Node prev, next;
        Node(int val) { this.val = val; }
    }

    private Node head, tail; // dummy sentinels
    private int size;

    public MyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    // Helper: get the node at given index (0-indexed)
    private Node getNode(int index) {
        Node curr;
        if (index < size / 2) {          // search from head if index is in first half
            curr = head.next;
            for (int i = 0; i < index; i++) curr = curr.next;
        } else {                          // search from tail if index is in second half
            curr = tail;
            for (int i = size; i > index; i--) curr = curr.prev;
        }
        return curr;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        return getNode(index).val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;         // invalid, can't insert beyond size
        if (index < 0) index = 0;         // treat negative as head insert

        Node next = (index == size) ? tail : getNode(index);
        Node prev = next.prev;

        Node newNode = new Node(val);
        newNode.prev = prev;
        newNode.next = next;
        prev.next = newNode;
        next.prev = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        Node curr = getNode(index);
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        size--;
    }
}