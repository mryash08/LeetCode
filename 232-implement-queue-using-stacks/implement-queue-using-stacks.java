class MyQueue {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> st1 = new Stack<>();


    public MyQueue() {
    }
    
    public void push(int x) {
        int y = st.size();
        for(int i=1; i<=y; i++){
            st1.add(st.pop());
        }
        st.add(x);
        int n = st1.size();
        for(int i=1; i<=n; i++){
            st.add(st1.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size() == 0) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */