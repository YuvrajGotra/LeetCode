class BrowserHistory {

    private String[] history;
    private int curr;
    private int size;

    public BrowserHistory(String homepage) {
        history = new String[5000];
        history[0] = homepage;
        curr = 0;
        size = 1;
    }
    
    public void visit(String url) {
        curr++;
        history[curr] = url;
        size = curr + 1;
    }
    
    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return history[curr];
    }
    
    public String forward(int steps) {
        curr = Math.min(size - 1, curr + steps);
        return history[curr];
    }
}