class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i : asteroids) {
            if(i > 0) st.push(i);
            else {
                while(st.size() != 0 && st.peek() > 0 && st.peek() < Math.abs(i)){
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0){
                    st.push(i);
                }
                if(st.peek()==Math.abs(i)){
                    st.pop();
                }
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();

        while(st.size() != 0) arr.add(st.pop());

        int[] res = new int[arr.size()];

        int idx = 0;
        for(int i = arr.size()-1; i >= 0; i--) {
            res[idx] = arr.get(i);
            idx++;
        }

        return res;
    }
}