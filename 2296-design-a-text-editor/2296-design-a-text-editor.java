class TextEditor {
    private Deque<Character> left;   // top = char closest to cursor on the left
    private Deque<Character> right;  // top = char closest to cursor on the right

    public TextEditor() {
        left = new ArrayDeque<>();
        right = new ArrayDeque<>();
    }

    public void addText(String text) {
        for (char c : text.toCharArray()) {
            left.push(c);
        }
    }

    public int deleteText(int k) {
        int deleted = 0;
        while (k-- > 0 && !left.isEmpty()) {
            left.pop();
            deleted++;
        }
        return deleted;
    }

    public String cursorLeft(int k) {
        while (k-- > 0 && !left.isEmpty()) {
            right.push(left.pop());
        }
        return getLast10();
    }

    public String cursorRight(int k) {
        while (k-- > 0 && !right.isEmpty()) {
            left.push(right.pop());
        }
        return getLast10();
    }

    private String getLast10() {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = left.iterator(); // iterates from top (closest to cursor)
        int count = 0;
        while (it.hasNext() && count < 10) {
            sb.append(it.next());
            count++;
        }
        return sb.reverse().toString();
    }
}