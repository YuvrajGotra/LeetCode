class MyHashMap {

    private static class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 10000;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    private Node find(Node head, int key) {
        Node prev = null;
        Node curr = head;

        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }

        return prev;
    }

    public void put(int key, int value) {
        int idx = hash(key);

        if (buckets[idx] == null) {
            buckets[idx] = new Node(-1, -1); // dummy node
        }

        Node prev = find(buckets[idx], key);

        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int idx = hash(key);

        if (buckets[idx] == null) return -1;

        Node prev = find(buckets[idx], key);

        if (prev.next == null) return -1;

        return prev.next.value;
    }

    public void remove(int key) {
        int idx = hash(key);

        if (buckets[idx] == null) return;

        Node prev = find(buckets[idx], key);

        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }
}