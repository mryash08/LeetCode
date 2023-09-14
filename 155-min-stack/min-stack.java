class MinStack {

    Stack<Long> st = new Stack<>();
    long min = 0;

    public MinStack() {
    }
    
    public void push(int val) {
        long x = (long)val;
        if(st.size() == 0){
            min = x;
            st.push(x);
        }else if(x < min){
            st.push(2 * x - min);
            min = x;
        }else{
            st.push(x);
        }
        
    }
    
    public void pop() {
        if(st.size() == 0) return;
        if(st.peek() < min){
            min = 2 * min - st.peek();
        }
        st.pop();
    }
    
    public int top() {
        if(st.size() == 0) return -1;
        long x = st.peek();
       if(st.peek() < min){
            return (int) min;
        }
        return (int)(x);
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */